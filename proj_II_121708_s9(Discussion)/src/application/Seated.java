package application;

/*Name: Mohammed Abed Alkareem
No: 1210708
Lecture sec: 5
Lab sec: 9*/
public class Seated extends PizzaOrder {
	private double serviceCharge; //The Service Charge
	private int numberOfPeople; //The Number Of People
	
	/**
	 * Default constructor for the Seated class.
	 */
	public Seated() {

	}
	/**
	 * Non-default constructor for the Seated class.
	 * 
	 * @param customerName     : Name of the customer
	 * @param pizzaSize        : Size of the pizza
	 * @param numberOfToppings : The number of topping
	 * @param toppingPrice     : The Price of the topping
	 * @param serviceCharge     : The Service Charge
	 * @param numberOfPeople     : The Number Of People
	 * 
	 */
	public Seated(String customerName, int pizzaSize, int numberOfToppings, double toppingPrice, double serviceCharge,
			int numberOfPeople) {
		super(customerName, pizzaSize, numberOfToppings, toppingPrice);
		this.serviceCharge = serviceCharge;
		this.numberOfPeople = numberOfPeople;
	}
/**
* A method to calculate the seated order price
*/
	@Override
	public double calculateOrderPrice() {
		double totalPrice = super.calculateOrderPrice();
		return totalPrice + (serviceCharge * numberOfPeople);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nserviceCharge=  " + serviceCharge + "\nnumberOfPeople=  " + numberOfPeople;
	}
}
