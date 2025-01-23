package Basic_Anudip;

  /* Question : Create a parent class called "Person" with attributes such
         as name, age, and a method called "speak". Create a child class
         called "Student" that inherits from Person and has an additional 
         attribute called "grade" and a method called "study". Create an
         object of the Student class and call both the "speak" and "study"
         methods.
   */

// Parent class
class Person
{
	//Attribute
   String name;
   int age;
   
   // Constructor
   Person(String name, int age) {
	   this.name = name;
	   this.age = age;
   }
   
   // Method
   void speck() {
	   System.out.println(name+" is specking.");
   }
}

// Child class
class Student extends Person
{
	// Additional Attributes
	char grade;
	
	// Constructor
	Student(String name, int age, char grade) {
		super(name,age);  // Calling parent class constructor
		this.grade = grade;
	}
	
	// Method
	void study() {
		System.out.println(name+" is studying in grade "+grade);
	}
}

// Main Class
public class SingleInheritance {

	public static void main(String[] args) {
		
		// object of Student class
		Student student1 = new Student("Wisher", 20, 'A');
		
		// calling speck method
		student1.speck();
		// calling study method
		student1.study();
		
		
		student1.name = "aish";
		student1.age = 20;
		student1.grade = 'A';
		
		System.out.println("\nName : "+student1.name);
		System.out.println("age : "+student1.age);
		System.out.println("Grade : "+student1.grade);
		
	/*	Output :
			Wisher is specking.
			Wisher is studying in grade A

			Name : aish
			age : 20
			Grade : A
	*/
		
	}

}
