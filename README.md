# Java FX Pizza Ordering System

## Project Description

This project is part of the Comp2310 course and involves creating a JavaFX GUI for handling pizza orders. Users can input order details, process the orders, view a list of orders, and reset the form. The project builds upon previous work and includes classes such as `PizzaOrder`, `Delivery`, `ToGo`, and `Seated`.

## Features

- **Customer Name**: Input field for the customer's name.
- **Order Type**: Dropdown to select order type (ToGo, Delivery, or Seated).
- **Pizza Size**: Dropdown to select pizza size (Small, Medium, Large).
- **Toppings**: Checkboxes for selecting toppings (Onions, Olives, Green Peppers).
- **Dynamic Fields**:
  - For Delivery: Fields for trip rate and zone.
  - For Seated: Fields for service charge and number of people.
- **Buttons**:
  - **Process Order**: Creates an order and calculates the price.
  - **Print Orders**: Displays a list of all orders.
  - **Reset**: Resets the form to default values.

## Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/Mohammed-Abed-Alkareem/Java-fx-project.git
    ```
2. Navigate to the project directory:
    ```sh
    cd Java-fx-project/proj_II_121708_s9(Discussion)/src
    ```
3. Open the project in your preferred Java IDE (e.g., IntelliJ, Eclipse).

## Usage

1. **Run the Application**: Execute the `Main.java` file to start the JavaFX application.
2. **Fill in the Form**: Enter the customer name, select the order type, pizza size, and toppings.
3. **Process the Order**: Click on the "Process Order" button to create and display the order price.
4. **Print Orders**: Click on the "Print Orders" button to view a sorted list of all orders.
5. **Reset Form**: Click on the "Reset" button to clear the form and reset to default values.

## Class Structure

- `PizzaOrder`: Base class for pizza orders.
- `ToGo`: Subclass representing ToGo orders.
- `Delivery`: Subclass representing Delivery orders.
- `Seated`: Subclass representing Seated orders.
- `Main`: Main class to launch the JavaFX application.

## Requirements

- Java Development Kit (JDK) 8 or higher
- JavaFX SDK
- An IDE supporting JavaFX development (e.g., IntelliJ IDEA, Eclipse)

# ScreenShots

#### sample run
![sample run](https://github.com/Mohammed-Abed-Alkareem/Java-fx-project/blob/main/proj_II_121708_s9(Discussion)/Screenshot%202023-09-21%20201258.jpg)

# Author

Mohammed Abed Alkareem
