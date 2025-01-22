package Basic_Anudip;

class Vehicle
{
	String brand;
	String model;
	int year;
	
	void drive() {
		System.out.println("Vehicle is driving.");
	}
	
}

class Car extends Vehicle
{
	String color;
	
	void honk() {
		System.out.println("Car class honk method");
	}
	
}

public class SingleInh {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.drive();
		car1.honk();
		
		car1.brand = "BMW";
		car1.model = "new model";
		car1.year = 2020;
		car1.color = "Black";
		
		System.out.println("Car Brand : "+car1.brand);
		System.out.println("Model : "+car1.model);
		System.out.println("Year : "+car1.year);
		System.out.println("Color : "+car1.color);
	}

}
