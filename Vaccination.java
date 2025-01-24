package Basic_Anudip;

/* 1.Create abstract class vaccine.Create two variables age(int),
      nationality(String).create 2 concrete methods firstDose() and 
      secondDose(). 
      Scenario 1:user can take the first dose if the user is 
      Indian and age is 18.After vaccination the user has to pay 
      250rs(which will be displayed on the console).
      
      Scenario 2: Users are eligible to take the second dose only after
       completing the first dose. 
       
      Scenario 3: create abstract method boosterDose() in abstract class 
      Vaccine.Create one implementation class vaccinationSuccessful, 
      where implement boosterDose() method. Create main class vaccination 
      and invoke all methods accordingly.
       
      [Hint:Create constructor to initialize variables age and nationality,
      Use flow control(Ifelse) to check condition]
   */

//Abstract class Vaccine
abstract class Vaccine {
	int age;
	String nationality;

	// Constructor to initialize age and nationality
	public Vaccine(int age, String nationality) {
		this.age = age;
		this.nationality = nationality;
	}

	// Concrete method: First Dose
	public void firstDose() {
		if (age >= 18 && nationality.equalsIgnoreCase("Indian")) {
			System.out.println("First dose completed. Please pay Rs.250.");
		} else {
			System.out.println("Not eligible for the first dose.");
		}
	}

	// Concrete method: Second Dose
	public void secondDose() {
		if (age >= 18 && nationality.equalsIgnoreCase("Indian")) {
			System.out.println("Second dose completed. Congratulations!");
		} else {
			System.out.println("Not eligible for the second dose.");
		}
	}

	// Abstract method: Booster Dose
	public abstract void boosterDose();
}

//Implementation class VaccinationSuccessful
class VaccinationSuccessful extends Vaccine {

	// Constructor
	public VaccinationSuccessful(int age, String nationality) {
		super(age, nationality);
	}

	// Implementing boosterDose method
	public void boosterDose() {
		if (age >= 18 && nationality.equalsIgnoreCase("Indian")) {
			System.out.println("Booster dose completed. Stay safe!");
		} else {
			System.out.println("Not eligible for the booster dose.");
		}
	}
}

//Main Class
public class Vaccination {
	public static void main(String[] args) {
		// Create object and test all methods
		VaccinationSuccessful user1 = new VaccinationSuccessful(20, "Indian");

		// First dose
		user1.firstDose();

		// Second dose
		user1.secondDose();

		// Booster dose
		user1.boosterDose();
		
	/*	Output

		First dose completed. Please pay Rs.250.
		Second dose completed. Congratulations!
		Booster dose completed. Stay safe!
	
	*/
		
		VaccinationSuccessful user2 = new VaccinationSuccessful(10, "Indian");

		// First dose
		user2.firstDose();

		// Second dose
		user2.secondDose();

		// Booster dose
		user2.boosterDose();
				
	/*	Output

		Not eligible for the first dose.
        Not eligible for the second dose.
        Not eligible for the booster dose.

		
	 */
		
	}
}