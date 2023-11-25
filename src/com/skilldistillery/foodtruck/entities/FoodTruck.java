package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private String Name;
	private String FoodType;
	private int averageRating;
	
	
	public FoodTruck() {
		
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getFoodType() {
		return FoodType;
	}


	public void setFoodType(String foodType) {
		FoodType = foodType;
	}


	public int getAverageRating() {
		return averageRating;
	}


	public void setAverageRating(int averageRating) {
		this.averageRating = averageRating;
	}


	public FoodTruck(String name, String foodType, int averageRating) {
		super();
		this.Name = name;
		this.FoodType = foodType;
		this.averageRating = averageRating;
	}
	
	@Override
	public String toString() {
		return "The name of the Truck is " + Name + ", the type of food sold is: " + FoodType + ", and it has an average rating of: "
				 + averageRating + " stars.";
	}


	public void displayFoodTruck() {
		String TruckData = toString();
		System.out.println(TruckData);
	}


	
	
}
