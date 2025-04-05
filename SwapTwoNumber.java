package Basic;

public class SwapTwoNumber {

	public static void main(String[] args) {
		
		int a=45, b=56;
		System.out.println("Before Swapping \n a="+a+"\n b= "+b);
		
		// First way using third variable
		int temp =a;
		a=b;
		b=temp;
		System.out.println("After Swapping \n a= "+a+"\n b="+b);
		
		// Second way
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping \n a= "+a+"\n b="+b);
		
		// Third way 
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swapping \n a= "+a+"\n b="+b);
		
	}

}
