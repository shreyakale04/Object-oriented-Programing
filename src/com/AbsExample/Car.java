package com.AbsExample;

public class Car {
	
	// A class representing a Car entity (OOP Concept: Encapsulation)
	
	    // Instance variables (Attributes of the object)
	    private String model;
	    private double price;

	    // Parameterized Constructor
	    public Car(String model, double price) {
	        // 'this.model' refers to the instance variable above.
	        // 'model' refers to the local constructor parameter.
	        this.model = model; 
	        this.price = price;
	    }

	    // Method to display car details
	    public void displayDetails() {
	        System.out.println("Car Model: " + this.model);
	        System.out.println("Car Price: $" + this.price);
	    }
	

	// Main class to execute the program

	    public static void main(String[] args) {
	        // Creating an object of the Car class
	        Car myCar = new Car("Tesla Model S", 89990.00);

	        // Calling the method to display data
	        myCar.displayDetails();
	    }
	}


