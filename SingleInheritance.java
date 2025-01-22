package Basic_Anudip;

class Person
{
   String name;
   int age;
   
   void speck() {
	   System.out.println("Person specking.");
   }
}

class Student extends Person
{
	char grade;
	
	void study() {
		System.out.println("Student study");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.speck();
		student1.study();
		
		student1.name = "aish";
		student1.age = 20;
		student1.grade = 'A';
		
		System.out.println("Name : "+student1.name);
		System.out.println("age : "+student1.age);
		System.out.println("Grade : "+student1.grade);
	}

}
