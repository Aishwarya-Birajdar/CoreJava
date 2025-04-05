package Basic;

public class SimpleInterest {

	public static void main(String[] args) {
		
		double principle = 3499;
		double rate = 45;
		int time = 3;
		double interest = (principle*rate*time) / 100;
		System.out.println("Interset : "+interest);
	}

}
