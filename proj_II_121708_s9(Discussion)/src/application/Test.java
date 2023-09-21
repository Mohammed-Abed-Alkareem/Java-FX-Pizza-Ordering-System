package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Test extends Application {
	
	private ArrayList<PizzaOrder> orders = new ArrayList<>();
	
	private int numOfToppings ;
	private String customerName = "";
	private int pizzaSize = 1;
	private double orderToppingPrice;
	private double orderTripRate;
	private int orderZone;
	private double totalOrderPrice=0;
	private double orderServiceCharge;
	private int orderNumOfPeople = 1;
	private static int numOfOrders = 0;
	
	
	public void start(Stage primaryStage) throws FileNotFoundException {
		
		
		StackPane pane = new StackPane();

		//the main pane to add al the fields virtically
				VBox pane1 = new VBox();
				pane1.setPadding(new Insets(20, 25, 20, 25));
				pane1.setAlignment(Pos.CENTER);

				// A pane to add the logo in it
				HBox paneLogo = new HBox();
				paneLogo.setAlignment(Pos.CENTER);

				// A pane for the customer name
				HBox paneName = new HBox();
				paneName.setPadding(new Insets(20, 0, 0, 5));
				paneName.setSpacing(20);

				// A pane for the order type
				HBox paneType = new HBox();
				paneType.setPadding(new Insets(20, 0, 0, 5));
				paneType.setSpacing(20);

				// A pane for the pizza size
				HBox paneSize = new HBox();
				paneSize.setPadding(new Insets(20, 0, 0, 5));
				paneSize.setSpacing(20);

				// A pane for the toppings
				HBox paneToppings = new HBox();
				paneToppings.setPadding(new Insets(20, 0, 0, 5));
				paneToppings.setSpacing(20);
				// a pane to arrange all the toppings
				FlowPane toppingPane = new FlowPane();
				toppingPane.setHgap(15);
				toppingPane.setVgap(10);

				// A pane for the topping price
				HBox paneToppingPrice = new HBox();
				paneToppingPrice.setPadding(new Insets(20, 0, 0, 5));
				paneToppingPrice.setSpacing(20);

				// A pane for the order price
				HBox paneOrderPrice = new HBox();
				paneOrderPrice.setPadding(new Insets(60, 0, 0, 5));
				paneOrderPrice.setSpacing(20);

				// A pane that contains the delivery and seated extra fields that are stack on
				// each other
				// during the running both or one of them diappear
				StackPane options = new StackPane();

				// A pane for the delivery extra fields
				VBox deliveryPane = new VBox();

				// A pane for the delivery Trip Rate
				HBox deliveryTripRatePane = new HBox();
				deliveryTripRatePane.setPadding(new Insets(20, 0, 0, 5));
				deliveryTripRatePane.setSpacing(20);

				// A pane for the delivery Zone
				HBox deliveryZonePane = new HBox();
				deliveryZonePane.setPadding(new Insets(20, 0, 0, 5));
				deliveryZonePane.setSpacing(20);

				// A pane for the seated extra fields
				VBox seatedPane = new VBox();

				// A pane for the service Charge
				HBox serviceChargePane = new HBox();
				serviceChargePane.setPadding(new Insets(20, 0, 0, 5));
				serviceChargePane.setSpacing(20);

				// A pane for the number Of People
				HBox numberOfPeoplePane = new HBox();
				numberOfPeoplePane.setPadding(new Insets(20, 0, 0, 5));
				numberOfPeoplePane.setSpacing(20);

				// A pane that contains All the buttons
				HBox buttonsPane = new HBox();
				buttonsPane.setPadding(new Insets(30, 0, 0, 5));
				buttonsPane.setSpacing(15);

		
		ImageView backgroungView = new ImageView(new Image(new FileInputStream(
				"D:\\University\\2nd Year\\First Semester (2022-2023)\\OBJECT-ORIENTED PROGRAMMING -COMP2310-\\Practical\\Assignments\\Project Phase II\\proj_II_121708_s9(Discussion)\\src\\application\\pizzaBackground.png")));

		ImageView logoView = new ImageView(new Image(new FileInputStream(
				"D:\\University\\2nd Year\\First Semester (2022-2023)\\OBJECT-ORIENTED PROGRAMMING -COMP2310-\\Practical\\Assignments\\Project Phase II\\proj_II_121708_s9(Discussion)\\src\\application\\PizzaIcon.png"))
		);
		
		ImageView nameIcon = new ImageView(new Image(new FileInputStream(
				"D:\\University\\2nd Year\\First Semester (2022-2023)\\OBJECT-ORIENTED PROGRAMMING -COMP2310-\\Practical\\Assignments\\Project Phase II\\proj_II_121708_s9(Discussion)\\src\\application\\nameIcon.png"))
		);
		nameIcon.setFitHeight(20);
		nameIcon.setFitWidth(20);

		ImageView typeIcon = new ImageView(new Image(new FileInputStream(
				"D:\\University\\2nd Year\\First Semester (2022-2023)\\OBJECT-ORIENTED PROGRAMMING -COMP2310-\\Practical\\Assignments\\Project Phase II\\proj_II_121708_s9(Discussion)\\src\\application\\orderType.png"))
		);
		typeIcon.setFitHeight(20);
		typeIcon.setFitWidth(20);

		ImageView sizeIcon = new ImageView(new Image(new FileInputStream(
				"D:\\University\\2nd Year\\First Semester (2022-2023)\\OBJECT-ORIENTED PROGRAMMING -COMP2310-\\Practical\\Assignments\\Project Phase II\\proj_II_121708_s9(Discussion)\\src\\application\\size.png"))
		);
		sizeIcon.setFitHeight(20);
		sizeIcon.setFitWidth(20);

		ImageView toppingIcon = new ImageView(new Image(new FileInputStream(
				"D:\\University\\2nd Year\\First Semester (2022-2023)\\OBJECT-ORIENTED PROGRAMMING -COMP2310-\\Practical\\Assignments\\Project Phase II\\proj_II_121708_s9(Discussion)\\src\\application\\toppings.png"))
		);
		toppingIcon.setFitHeight(20);
		toppingIcon.setFitWidth(20);

		ImageView toppingPriceIcon = new ImageView(new Image(new FileInputStream(
				"D:\\University\\2nd Year\\First Semester (2022-2023)\\OBJECT-ORIENTED PROGRAMMING -COMP2310-\\Practical\\Assignments\\Project Phase II\\proj_II_121708_s9(Discussion)\\src\\application\\toppingPrice.png"))
		);
		toppingPriceIcon.setFitHeight(20);
		toppingPriceIcon.setFitWidth(20);

		ImageView orderPriceIcon = new ImageView(new Image(new FileInputStream(
				"D:\\University\\2nd Year\\First Semester (2022-2023)\\OBJECT-ORIENTED PROGRAMMING -COMP2310-\\Practical\\Assignments\\Project Phase II\\proj_II_121708_s9(Discussion)\\src\\application\\orderPrice.png"))
		);
		orderPriceIcon.setFitHeight(20);
		orderPriceIcon.setFitWidth(20);

		Font titleFont = new Font("Times New Roman", 20);

		Font choiceFont = new Font("Times New Roman", 15);

		Label name = new Label("Customer Name:", nameIcon);
		name.setFont(titleFont);
		name.setTextFill(Color.WHITE);

		Label type = new Label("Order Type:", typeIcon);
		type.setFont(titleFont);
		type.setTextFill(Color.WHITE);

		Label size = new Label("Size:", sizeIcon);
		size.setFont(titleFont);
		size.setTextFill(Color.WHITE);

		Label toppings = new Label("Toppings:", toppingIcon);
		toppings.setFont(titleFont);
		toppings.setTextFill(Color.WHITE);

		Label toppingPrice = new Label("Topping Price:", toppingPriceIcon);
		toppingPrice.setFont(titleFont);
		toppingPrice.setTextFill(Color.WHITE);

		Label orderPrice = new Label("Order Price:", orderPriceIcon);
		orderPrice.setFont(titleFont);
		orderPrice.setTextFill(Color.WHITE);

		Label tripRate = new Label("Trip Rate:");
		tripRate.setFont(titleFont);
		tripRate.setTextFill(Color.WHITE);

		Label zone = new Label("Zone:");
		zone.setFont(titleFont);
		zone.setTextFill(Color.WHITE);

		Label serviceCharge = new Label("Service Charge :");
		serviceCharge.setFont(titleFont);
		serviceCharge.setTextFill(Color.WHITE);

		Label numberOfPeople = new Label("Number Of People:");
		numberOfPeople.setFont(titleFont);
		numberOfPeople.setTextFill(Color.WHITE);
		
		Label lblOrderPrice = new Label("0.0");
		lblOrderPrice.setFont(titleFont);
		lblOrderPrice.setTextFill(Color.WHITE);

		TextField txtName = new TextField();
		TextField txtToppingPrice = new TextField("10");
		
		TextField txtTripRate = new TextField("0.0");
		TextField txtServiceCharge = new TextField("0.0");
		TextField txtNumberOfPeople = new TextField("1");

		// make radio buttons for the order types:
				RadioButton toGo = new RadioButton("ToGo");
				toGo.setTextFill(Color.WHITE);
				toGo.setFont(choiceFont);
				RadioButton delivery = new RadioButton("Delivery");
				delivery.setTextFill(Color.WHITE);
				delivery.setFont(choiceFont);
				RadioButton seated = new RadioButton("Seated");
				seated.setTextFill(Color.WHITE);
				seated.setFont(choiceFont);

				// combine the radio buttons in a toggle groub
				ToggleGroup types = new ToggleGroup();
				toGo.setToggleGroup(types);
				delivery.setToggleGroup(types);
				seated.setToggleGroup(types);

				// the defulat choice is to go
				toGo.setSelected(true);

				// the default apearance is without the seated and delivery extra attributes
				seatedPane.setVisible(false);
				deliveryPane.setVisible(false);

				// to display only the delivery extra attributes if the delivery radio button is
				// selected
				delivery.setOnAction(e -> {
					deliveryPane.setVisible(true);
					seatedPane.setVisible(false);

				});

				// to display only the seated extra attributes if the seated radio button is
				// selected
				seated.setOnAction(e -> {

					seatedPane.setVisible(true);
					deliveryPane.setVisible(false);

				});
				// to hide both delivery and seated extra fields if togo radio button is
				// selected
				toGo.setOnAction(e -> {

					deliveryPane.setVisible(false);
					seatedPane.setVisible(false);

				});

				// make a combo box for choosing the size of the pizza
				ComboBox<String> sizeBox = new ComboBox<>();
				sizeBox.getItems().addAll("Small", "Medium", "Large");
				sizeBox.setValue("Small");

				sizeBox.setOnAction(e -> {
					if (sizeBox.getValue().equals("Large"))
						pizzaSize = PizzaOrder.LARGE;

					else if (sizeBox.getValue().equals("Medium"))
						pizzaSize = PizzaOrder.MEDIUM;

					else
						pizzaSize = PizzaOrder.SMALL;

				});

				// make check boxes for choosing the toppings
				CheckBox onion = new CheckBox("Onions");
				onion.setTextFill(Color.WHITE);
				onion.setFont(choiceFont);

				onion.setOnAction(e -> {
					if (onion.isSelected())
						numOfToppings++;
					else
						numOfToppings--;
				});

				CheckBox olives = new CheckBox("Olives");
				olives.setTextFill(Color.WHITE);
				olives.setFont(choiceFont);

				olives.setOnAction(e -> {
					if (olives.isSelected())
						numOfToppings++;
					else
						numOfToppings--;
				});

				CheckBox greenPeppers = new CheckBox("Green Peppers");
				greenPeppers.setTextFill(Color.WHITE);
				greenPeppers.setFont(choiceFont);

				greenPeppers.setOnAction(e -> {
					if (greenPeppers.isSelected())
						numOfToppings++;
					else
						numOfToppings--;
				});

				CheckBox mushroom = new CheckBox("Mushroom");
				mushroom.setTextFill(Color.WHITE);
				mushroom.setFont(choiceFont);

				mushroom.setOnAction(e -> {
					if (mushroom.isSelected())
						numOfToppings++;
					else
						numOfToppings--;
				});

				CheckBox corn = new CheckBox("Corn");
				corn.setTextFill(Color.WHITE);
				corn.setFont(choiceFont);

				corn.setOnAction(e -> {
					if (corn.isSelected())
						numOfToppings++;
					else
						numOfToppings--;
				});

				CheckBox pepperoni = new CheckBox("Pepperoni");
				pepperoni.setTextFill(Color.WHITE);
				pepperoni.setFont(choiceFont);

				pepperoni.setOnAction(e -> {
					if (pepperoni.isSelected())
						numOfToppings++;
					else
						numOfToppings--;
				});

				CheckBox spinach = new CheckBox("Spinach");
				spinach.setTextFill(Color.WHITE);
				spinach.setFont(choiceFont);

				spinach.setOnAction(e -> {
					if (spinach.isSelected())
						numOfToppings++;
					else
						numOfToppings--;
				});

				CheckBox broccoli = new CheckBox("Broccoli");
				broccoli.setTextFill(Color.WHITE);
				broccoli.setFont(choiceFont);

				broccoli.setOnAction(e -> {
					if (broccoli.isSelected())
						numOfToppings++;
					else
						numOfToppings--;
				});

				ComboBox<Integer> zoneslist = new ComboBox<>();
				zoneslist.getItems().addAll(1, 2, 3, 4);
				zoneslist.setValue(1);

				zoneslist.setOnAction(e -> {

					if (zoneslist.getValue().equals(1))
						orderZone = 1;

					else if (zoneslist.getValue().equals(2))
						orderZone = 2;
					else if (zoneslist.getValue().equals(3))
						orderZone = 3;

					else
						orderZone = 4;

				});

		// a button to process the order

				Button btProcessOrder = new Button("ProcessOrder");
				btProcessOrder.setFont(choiceFont);
				btProcessOrder.setOnAction(e -> {

					customerName = txtName.getText();
					orderToppingPrice = Double.parseDouble(txtToppingPrice.getText());
					orderTripRate = Double.parseDouble(txtTripRate.getText());
					orderServiceCharge = Double.parseDouble(txtServiceCharge.getText());
					orderNumOfPeople = Integer.parseInt(txtNumberOfPeople.getText());

					if (delivery.isSelected()) {

						orders.add(new Delivery(customerName, pizzaSize, numOfToppings, orderToppingPrice, orderTripRate,
								orderZone));

						totalOrderPrice = orders.get(numOfOrders).calculateOrderPrice();
						lblOrderPrice.setText(totalOrderPrice + "");
						numOfOrders++;
					} else if (seated.isSelected()) {
						orders.add(new Seated(customerName, pizzaSize, numOfToppings, orderToppingPrice, orderServiceCharge,
								orderNumOfPeople));

						totalOrderPrice = orders.get(numOfOrders).calculateOrderPrice();
						lblOrderPrice.setText(totalOrderPrice + "");
						numOfOrders++;
					} else {

						orders.add(new ToGo(customerName, pizzaSize, numOfToppings, orderToppingPrice));

						totalOrderPrice = orders.get(numOfOrders).calculateOrderPrice();
						lblOrderPrice.setText(totalOrderPrice + "");
						numOfOrders++;

					}

				});

				// a button to print the orders
				Button btPrintOrders = new Button("PrintOrders");
				btPrintOrders.setFont(choiceFont);
				btPrintOrders.setOnAction(e -> {

					FlowPane printPane = new FlowPane();
					printPane.setVgap(10);
					
					TextArea txtPrintAll = new TextArea();

					Collections.sort(orders);

					StringBuilder sb = new StringBuilder("Customer Name \t Order Price \n ");
					for (int i = 0; i < orders.size(); i++) {
						sb.append((i + 1) + ") " + orders.get(i).printOrderInfo() + "\n");

					}
					txtPrintAll.setText(sb.toString());
					
					//a button to exit from print orders pane
					Button btexit = new Button("exit");
					btexit.setFont(choiceFont);
					btexit.setTextFill(Color.RED);
					
					
					txtPrintAll.setFont(titleFont);
					printPane.getChildren().addAll(txtPrintAll,btexit);
					txtPrintAll.setEditable(false);

					Scene printScene = new Scene(printPane,350,310);
					Stage printStage = new Stage();
					printStage.setResizable(false);
					printStage.setScene(printScene);
					printStage.setTitle("Print Pizza Orders");
					printStage.show();
				
					btexit.setOnAction(t->printStage.close());

				});
				// a button to reset all the fields
				Button btReset = new Button("Reset");
				btReset.setFont(choiceFont);
				btReset.setTextFill(Color.RED);

				btReset.setOnAction(e -> {

					txtName.setText("");
					toGo.setSelected(true);
					seatedPane.setVisible(false);
					deliveryPane.setVisible(false);
					sizeBox.setValue("Small");

					onion.setSelected(false);
					olives.setSelected(false);
					greenPeppers.setSelected(false);
					mushroom.setSelected(false);
					corn.setSelected(false);
					pepperoni.setSelected(false);
					spinach.setSelected(false);
					broccoli.setSelected(false);

					txtToppingPrice.setText("10");

					txtTripRate.setText("0.0");
					txtServiceCharge.setText("");
					txtNumberOfPeople.setText("1");
					zoneslist.setValue(1);
					txtServiceCharge.setText("0.0");
					
					numOfToppings = 0;
					lblOrderPrice.setText("0.0");

					orders.removeAll(orders);
					numOfOrders = 0;

				});


		toppingPane.getChildren().addAll(onion, olives, greenPeppers, mushroom, corn, pepperoni, spinach, broccoli);

		seatedPane.setVisible(false);

		paneLogo.getChildren().addAll(logoView);
		paneName.getChildren().addAll(name, txtName);
		paneType.getChildren().addAll(type, toGo, delivery, seated);
		paneSize.getChildren().addAll(size, sizeBox);
		paneToppingPrice.getChildren().addAll(toppingPrice, txtToppingPrice);
		paneOrderPrice.getChildren().addAll(orderPrice, lblOrderPrice);

		paneToppings.getChildren().addAll(toppings, toppingPane);

		deliveryTripRatePane.getChildren().addAll(tripRate, txtTripRate);
		deliveryZonePane.getChildren().addAll(zone, zoneslist);
		deliveryPane.getChildren().addAll(deliveryTripRatePane, deliveryZonePane);

		serviceChargePane.getChildren().addAll(serviceCharge, txtServiceCharge);
		numberOfPeoplePane.getChildren().addAll(numberOfPeople, txtNumberOfPeople);
		seatedPane.getChildren().addAll(serviceChargePane, numberOfPeoplePane);

		options.getChildren().addAll(deliveryPane, seatedPane);

		buttonsPane.getChildren().addAll(btProcessOrder, btPrintOrders, btReset);

		pane1.getChildren().addAll(paneLogo, paneName, paneType, paneSize, paneToppings, paneToppingPrice, options,
				paneOrderPrice, buttonsPane);

		pane.getChildren().addAll(backgroungView, pane1);

		Scene scene = new Scene(pane, 600, 700);
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Pizza Orders");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
