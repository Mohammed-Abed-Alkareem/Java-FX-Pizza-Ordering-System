package application;

/*Name: Mohammed Abed Alkareem
No: 1210708
Lecture sec: 5
Lab sec: 9*/
import java.util.Date;

public class PizzaOrder implements Comparable<PizzaOrder> {

	public static final int LARGE = 3;
	public static final int MEDIUM = 2;
	public static final int SMALL = 1;

	private String customerName; //The Name Of the Customer
	private Date dateOrdered = new Date();//The Date Ordered
	private int pizzaSize;//The Size of the Pizza
	private int numberOfToppings;//Number Of Toppings
	private double toppingPrice;//The Price Of the Topping

	/**
	 * Default constructor for the PizzaOrder class.
	 */
	public PizzaOrder() {
	}

	/**
	 * Non-default constructor for the PizzaOrder class.
	 * 
	 * @param customerName     : Name of the customer
	 * @param pizzaSize        : Size of the pizza
	 * @param numberOfToppings : The number of topping
	 * @param toppingPrice     : The Price of the topping
	 */
	public PizzaOrder(String customerName, int pizzaSize, int numberOfToppings, double toppingPrice) {
		this.customerName = customerName;
		this.pizzaSize = pizzaSize;
		this.numberOfToppings = numberOfToppings;
		this.toppingPrice = toppingPrice;
	}

	@Override
	public String toString() {
		
		
		
		String pizzaSizeStr;
		if (pizzaSize == 3)
			pizzaSizeStr = "Large";
		else if (pizzaSize == 2)
			pizzaSizeStr = "Medium";
		else
			pizzaSizeStr = "Small";
					
		return "customerName=  " + customerName + "\ndateOrdered=  " + dateOrdered + "\npizzaSize=  " + pizzaSizeStr
				+ "\nnumberOfToppings=  " + numberOfToppings + "\ntoppingPrice=  " + toppingPrice;
	}
/**
* A method to calculate the order price
* @return Order Price
*/
	public double calculateOrderPrice() {

		return numberOfToppings * toppingPrice * pizzaSize;
	}
	/**
	 * A method to print Customer name and the Order Price
	 */
	public String printOrderInfo() {

		return(customerName + "\t " + calculateOrderPrice());
	}
/**
* A method to compare order price 
*/
	@Override
	public int compareTo(PizzaOrder o) {
		return Double.compare(this.calculateOrderPrice(), o.calculateOrderPrice());
	}
}
