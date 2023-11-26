package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	private FoodTruck[] fleet = new FoodTruck[5];
	private int truckCount = 0;

	public static void main(String[] args) {
		FoodTruckApp app = new FoodTruckApp();
		app.run();
	}

	public void run() {
		Scanner input = new Scanner(System.in);
		int counter = 0;
		String answer = "";
		do {
			System.out.println("Welcome, please enter the name, food type, and rating for up to five food trucks");
			System.out.println("You may also choose to quit at any time by typing: (Quit) when prompted to.");

			System.out.print("Name of the truck (or type 'Quit' to exit): ");
			String truckName = input.next();

			if (truckName.equalsIgnoreCase("Quit")) {
				break;
			}

			System.out.print("What's the Food type?: ");
			String foodType = input.next();

			System.out.println("How would you rate it? (out of 5 stars): ");
			int rating = input.nextInt();
			
			FoodTruck foodTruck = new FoodTruck(truckName, foodType, rating);
			fleet[truckCount++] = foodTruck;

			System.out.println("Food truck added successfully!");
			System.out.println();
			foodTruck.displayFoodTruck();
			System.out.println();
			System.out.println("Would you like to add another truck? Yes (Y) or No (N)");
			answer = input.next();

			if (answer.equalsIgnoreCase("N")) {
				break;
			}

			counter++;

		} while (counter < 6 && answer.equalsIgnoreCase("Y"));

		if (answer.equalsIgnoreCase("N")) {
			displayMenu();
			answer = input.next();

			switch (answer.toLowerCase()) {
			case "1":
				listAllFoodTrucks();
				break;
			case "2":
				CalculateRating();
				break;
			case "3":
				HighestRated();
				break;
			case "4":
				System.out.println("Goodbye!");
				input.close();
				System.exit(0);
			default:
				System.out.println("Invalid option. Please choose again.");
			}
		}
	}

	public void displayMenu() {
		System.out.println("Select an option:");
		System.out.println("1. List all existing food trucks.");
		System.out.println("2. See the average rating of food trucks.");
		System.out.println("3. Display the highest-rated food truck.");
		System.out.println("4. Quit the program.");
	}

	public void listAllFoodTrucks() {
		Scanner input2 = new Scanner(System.in);
		System.out.println("Listing all food trucks:");
		for (int i = 0; i < truckCount; i++) {
			fleet[i].displayFoodTruck();
		}
		System.out.println("Would you like to start over? (Y/N)");
		String answer = input2.next();
		if (answer.equalsIgnoreCase("Y")) {
			run();
		} else if (answer.equals("N")) {
			System.exit(0);
		} else {
			System.out.println("Going back to the menu");
			if (answer.equalsIgnoreCase("N")) {
				displayMenu();
				answer = input2.next();

				switch (answer.toLowerCase()) {
				case "1":
					listAllFoodTrucks();
					break;
				case "2":
					CalculateRating();
					break;
				case "3":
					HighestRated();
					break;
				case "4":
					System.out.println("Goodbye!");
					input2.close();
					System.exit(0);
				default:
					System.out.println("Invalid option. Please choose again.");
				}
			}
		}
	}

	public void CalculateRating() {
		Scanner input2 = new Scanner(System.in);
		if (truckCount == 0) {
			System.out.println("No food trucks to calculate average rating.");
			return;
		}

		int totalRating = 0;
		for (int i = 0; i < truckCount; i++) {
			totalRating += fleet[i].getAverageRating();
		}

		float averageRating = (float) totalRating / truckCount;
		System.out.println("Average rating of food trucks: " + averageRating);
		System.out.println("Would you like to start over? (Y/N)");
		String answer = input2.next();
		if (answer.equalsIgnoreCase("Y")) {
			run();
		} else if (answer.equals("N")) {
			System.exit(0);
		} else {
			System.out.println("Going back to the menu");
			if (answer.equalsIgnoreCase("N")) {
				displayMenu();
				answer = input2.next();

				switch (answer.toLowerCase()) {
				case "1":
					listAllFoodTrucks();
					break;
				case "2":
					CalculateRating();
					break;
				case "3":
					HighestRated();
					break;
				case "4":
					System.out.println("Goodbye!");
					input2.close();
					System.exit(0);
				default:
					System.out.println("Invalid option. Please choose again.");

				}
			}
		}
	}

	public void HighestRated() {
		Scanner input2 = new Scanner(System.in);
		if (truckCount == 0) {
			System.out.println("No food trucks to display.");
			return;
		}

		FoodTruck highestRatedTruck = fleet[0];
		for (int i = 1; i < truckCount; i++) {
			if (fleet[i].getAverageRating() > highestRatedTruck.getAverageRating()) {
				highestRatedTruck = fleet[i];
			}
		}

		System.out.println("Highest-rated food truck:");
		highestRatedTruck.displayFoodTruck();
		System.out.println("\n");
		System.out.println("Would you like to start over? (Y/N)");
		String answer = input2.next();
		if (answer.equalsIgnoreCase("Y")) {
			run();
		} else if (answer.equals("N")) {
			System.out.println("Goodbye!");
		} else {

			System.out.println("Going back to the menu");
			if (answer.equalsIgnoreCase("N")) {
				displayMenu();
				answer = input2.next();

				switch (answer.toLowerCase()) {
				case "1":
					listAllFoodTrucks();
					break;
				case "2":
					CalculateRating();
					break;
				case "3":
					HighestRated();
					break;
				case "4":
					System.out.println("Goodbye!");
					input2.close();
					System.exit(0);
				default:
					System.out.println("Invalid option. Please choose again.");
				}
			}
		}

	}
}
