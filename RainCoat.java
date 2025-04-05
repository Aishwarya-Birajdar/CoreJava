package Basic;

public class RainCoat {

	public static void main(String[] args) {
		
		/* Scenario: You're deciding whether to wear a raincoat.
		    • Condition: "Is it raining?"
			• Action: "Wear a raincoat if true.
		*/ 
		boolean isRaining = true;
		if (isRaining) {
		    System.out.println("Wear a raincoat!");
		}
		
		boolean checkNumber = false;
		if (checkNumber) {
			System.out.println("Yes no is there");
		} else {
			System.out.println("No , no is not there");
		}
		
		//  "Pizza" is available, eat it. Else, eat a sandwich
		boolean pizzaAvailable = true;
		if (pizzaAvailable)
			System.out.println("Eat, Pizza");
		else
			System.out.println("Eat, chapti");
		
		System.out.println();
		//Print the numbers 1 to 5.
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			}
		
		// Scenario: Keep eating candies until the jar is empty
		int candie = 5;
		while(candie > 0) {
			candie--;
			if (candie > 0) {
				System.out.println("Keep eating candies");
			} else {
				System.out.println("jar is empty");
			}
			candie--;
		}
		
		System.out.println();
		
		// Scenario: Deciding whether to carry an umbrella
		boolean isRain = true;
		if (isRain)
			System.out.println("carry an umbrella");
		else
			System.out.println("Does not need carry an umbrella");
		
		System.out.println();
		
		// Scenario: Deciding dinner based on the day.
		int day = 2;
		switch(day) {
		case 1: System.out.println("Monday, Eat Pizza"); break;
		case 2: System.out.println("Tus, Eat Chapatti"); break;
		default : System.out.println("Eat Normal Food");
		}
		
		System.out.println();
		
		String day1 = "Monday";
		switch(day1) {
		case "Monday" : System.out.println("Eat, what you what"); break;
		case "Tuesday" : System.out.println("Eat, Normal Food"); break;
		default : System.out.println("Only Drink Water");
		}
		
		System.out.println();
		
		// Scenario: Emptying a basket of apples
		int apple = 5;
		while(apple > 0) {
			System.out.println("Eating an apple. Remaining: " + apple);
			apple--;
		}
		
		System.out.println();
		
		// until empty basket
		while(apple != 0) {
			if (apple > 0) {
				System.out.println("Eating an apple. Reamaining: "+apple);
				apple--;
				System.out.println("Apples are finshed");
			} else {
				System.out.println("Sorry Dont have apples "+apple);
				apple--;
			}	
		}
		
		// Scenario: Eating a chocolate at least once, then checking if there’s more.
		
		int chocklet = 1;
		do {
			System.out.println("Eat chocklet "+chocklet);
			chocklet--;
		} while(chocklet > 0);


	}

}
