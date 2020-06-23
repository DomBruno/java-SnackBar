package snackBar;

public class Main {

	private static void processData(){
		
		Customer jane = new Customer("Jane", 45.25);
		Customer bob = new Customer("Bob", 33.14);

		VendingMachine food = new VendingMachine("Food");
		VendingMachine drink = new VendingMachine("Drink");
		VendingMachine office = new VendingMachine("Office");

		Snack chips = new Snack("Chips", 36, 1.75, food.getId());
		Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.getId());
		Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());
		Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
		Snack water = new Snack("Water", 20, 2.75, drink.getId());

	//PROCESSING

		System.out.println("\n");

		var quantityOfItems = 3;
		jane.buySnack(quantityOfItems, soda.getCost());
		soda.buySnack(quantityOfItems);
		System.out.println("Customer 1 (Jane) cash on hand " + "$" + jane.getCashOnHand());
		System.out.println("Quantity of snack 4 (Soda) is " + soda.getQuantity());

		System.out.println("\n");

		quantityOfItems = 1;
		jane.buySnack(quantityOfItems, pretzel.getCost());
		pretzel.buySnack(quantityOfItems);
		System.out.println("Customer 1 (Jane) cash on hand " + "$" + jane.getCashOnHand());
		System.out.println("Quantity of snack 3 (Pretzel) is " + pretzel.getQuantity());

		System.out.println("\n");

		quantityOfItems = 2;
		bob.buySnack(quantityOfItems, soda.getCost());
		soda.buySnack(quantityOfItems);
		System.out.println("Customer 2 (Bob) cash on hand " + "$" + bob.getCashOnHand());
		System.out.println("Quantity of snack 4 (Soda) is " + soda.getQuantity());

		System.out.println("\n");

		double foundMoney = 10;
		jane.addCash(foundMoney);
		System.out.println("Customer 1 (Jane) cash on hand " + "$" + jane.getCashOnHand());

		System.out.println("\n");

		quantityOfItems = 1;
		jane.buySnack(quantityOfItems, chocolateBar.getCost());
		chocolateBar.buySnack(quantityOfItems);
		System.out.println("Customer 1 (Jane) cash on hand " + "$" + jane.getCashOnHand());
		System.out.println("Quantity of snack 2 (Chocolate Bar) is " + chocolateBar.getQuantity());

		System.out.println("\n");

		quantityOfItems = 12;
		pretzel.setQuantity(quantityOfItems);
		System.out.println("Quantity of snack 3 (Pretzel) is " + pretzel.getQuantity());

		System.out.println("\n");

		quantityOfItems = 3;
		bob.buySnack(quantityOfItems, pretzel.getCost());
		pretzel.buySnack(quantityOfItems);
		System.out.println("Customer 2 (Bob) cash on hand " + "$" + bob.getCashOnHand());
		System.out.println("Quantity of snack 3 (Pretzel) is " + pretzel.getQuantity());

		System.out.println("\n");

		System.out.println("****** STRETCH GOALS ******");

		System.out.println("\n");

		System.out.println("Name: " + chips.getName());
		System.out.println("Vending Machine: " + food.getName());
		System.out.println("Quantity: " + chips.getQuantity());
		System.out.println("Total Cost: " + "$" + chips.getTotalCost(chips.getQuantity()));

		System.out.println("\n");

		System.out.println("Name: " + chocolateBar.getName());
		System.out.println("Vending Machine: " + food.getName());
		System.out.println("Quantity: " + chocolateBar.getQuantity());
		System.out.println("Total Cost: " + "$" + chocolateBar.getTotalCost(chocolateBar.getQuantity()));

		System.out.println("\n");

		System.out.println("Name: " + pretzel.getName());
		System.out.println("Vending Machine: " + food.getName());
		System.out.println("Quantity: " + pretzel.getQuantity());
		System.out.println("Total Cost: " + "$" + pretzel.getTotalCost(pretzel.getQuantity()));

		System.out.println("\n");

		System.out.println("Name: " + soda.getName());
		System.out.println("Vending Machine: " + drink.getName());
		System.out.println("Quantity: " + soda.getQuantity());
		System.out.println("Total Cost: " + "$" + soda.getTotalCost(soda.getQuantity()));

		System.out.println("\n");

		System.out.println("Name: " + water.getName());
		System.out.println("Vending Machine: " + drink.getName());
		System.out.println("Quantity: " + water.getQuantity());
		System.out.println("Total Cost: " + "$" + water.getTotalCost(water.getQuantity()));

		System.out.println("\n");


	}

	public static void main(String[] args) {
		processData();
	}
}