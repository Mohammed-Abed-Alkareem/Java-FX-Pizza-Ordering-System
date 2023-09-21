package application;

/*Name: Mohammed Abed Alkareem
No: 1210708
Lecture sec: 5
Lab sec: 9*/

public class ToGo extends PizzaOrder {

	/**
	 * Default constructor for the ToGo class.
	 */
	public ToGo() {
	}

	/**
	 * Non-default constructor for the ToGo class.
	 * 
	 * @param customerName     : Name of the customer
	 * @param pizzaSize        : Size of the pizza
	 * @param numberOfToppings : The number of topping
	 * @param toppingPrice     : The Price of the topping
	 */
	public ToGo(String customerName, int pizzaSize, int numberOfToppings, double toppingPrice) {
		super(customerName, pizzaSize, numberOfToppings, toppingPrice);
	}

	@Override
	public String toString() {
		return "To Go: " + super.toString();
	}
}
