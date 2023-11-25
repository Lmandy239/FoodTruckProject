package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	private FoodTruck[] fleet = new FoodTruck[5];

	public static void main(String[] args) {
		FoodTruckApp app = new FoodTruckApp();
		app.run();
	}

	public void run() {
		Scanner input = new Scanner(System.in);
		int counter = 0;
		String answer = "";
		do {
			System.out.println("Welcome, please enter the name, food type, and rating for " + "up to five food trucks");
			System.out.println("You may also choose to quit at anytime by typing: (Quit) when prompted to.");
			
		
                System.out.print("Name of the truck (or type 'Quit' to exit): ");
                 String truckName = input.next();

                if (truckName.equalsIgnoreCase("Quit")) {
                    break;
                }

                System.out.print("What's the Food type?: ");
                String foodType = input.next();
                
				System.out.println("How would you rate it?(out of 5 stars): ");

				int rating = input.nextInt();
				
				FoodTruck foodTruck = new FoodTruck(truckName, foodType, rating);
				foodTruck.displayFoodTruck();
				System.out.println(" ");
				System.out.println("Would you like to add another truck or quit? Yes (Y) or No (N)");
				answer = input.next();
			
			
			counter ++;
			
		} while (counter <= 5 && answer.equalsIgnoreCase("Y"));

	}
	

    private void displayMenu() {
        System.out.println("Select an option:");
        System.out.println("1. List all existing food trucks.");
        System.out.println("2. See the average rating of food trucks.");
        System.out.println("3. Display the highest-rated food truck.");
        System.out.println("4. Quit the program.");
    }
}
