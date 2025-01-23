package Basic_Anudip;

   /* Question : Create a parent class called "Vehicle" with attributes such
        as brand, model, year, and a method called "drive". Create a child 
        class called "Car" that inherits from Vehicle and has an additional
        attribute called "color" and a method called "honk". Create an 
        object of the Car class and call both the "drive" and "honk" methods.
    */

// Parent class
class Vehicle
{
	// Attributes
	String brand;
	String model;
	int year;
	
	// Constructor
	Vehicle(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	
	// Method
	void drive() {
		System.out.println("Vehicle is driving.");
	}
	
}

// Child Class
class Car extends Vehicle
{
	// Additional Attributes
	String color;
	
	// Constructor
	Car(String brand, String model, int year, String color) {
		super(brand, model, year);  // calling  parent class constructor
		this.color = color;
	}
	
	// Method
	void honk() {
		System.out.println("Car class honk method");
	}
	
}

// Main class
public class SingleInh {

	public static void main(String[] args) {
		
		// Object of child class or Car class
		Car car1 = new Car("BMW", "Coralla", 2020, "Black");
		
		// calling drive method
		car1.drive();
		// calling honk method
		car1.honk();
		
		System.out.println();
		car1.brand = "BMW";
		car1.model = "new model";
		car1.year = 2020;
		car1.color = "Black";
		
		System.out.println("Car Brand : "+car1.brand);
		System.out.println("Model : "+car1.model);
		System.out.println("Year : "+car1.year);
		System.out.println("Color : "+car1.color);
		
	/*	Output : 
		    Vehicle is driving.
			Car class honk method

			Car Brand : BMW
			Model : new model
			Year : 2020
			Color : Black
	*/ 
	}

}
