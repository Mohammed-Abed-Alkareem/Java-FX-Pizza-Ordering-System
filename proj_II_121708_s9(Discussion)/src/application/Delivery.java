package application;

/*Name: Mohammed Abed Alkareem
No: 1210708
Lecture sec: 5
Lab sec: 9*/
public class Delivery extends PizzaOrder {
	private double tripRate; // the rate of the trip
	private int zone; // the number of the zone

	/**
	 * Default constructor for the Delivery class.
	 */
	public Delivery() {

	}

	/**
	 * Non-default constructor for the PizzaOrder class.
	 *
	 * @param customerName     : Name of the customer
	 * @param pizzaSize        : Size of the pizza
	 * @param numberOfToppings : The number of topping
	 * @param toppingPrice     : The Price of the topping
	 * @param tripRate         : the rate of the trip
	 * @param zone             : the number of the zone
	 */
	public Delivery(String customerName, int pizzaSize, int numberOfToppings, double toppingPrice, double tripRate,
			int zone) {
		super(customerName, pizzaSize, numberOfToppings, toppingPrice);
		this.tripRate = tripRate;
		this.zone = zone;
	}

	@Override
	public String toString() {
		return super.toString() + "\ntripRate=  " + tripRate + "\nzone=  " + zone;
	}
/**
* A method to calculate the delivery order price
*/
	@Override
	public double calculateOrderPrice() {
		double totalPrice = super.calculateOrderPrice();
		return totalPrice + (tripRate / 100 * totalPrice * zone);
	}

}
