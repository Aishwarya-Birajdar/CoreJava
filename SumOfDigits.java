package Basic;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int sum = 0;
		int num = 123;
		while(num > 0) {
			int r = num % 10;
			sum = sum + r;
			num = num / 10;
		}
		System.out.println("Sum of digit "+sum);
		
		System.out.println();
		int n=23;
		int s=0;
		while(n>0) {
			s += n % 10;
			n = n / 10;
		}
		 System.out.println("sum "+s);
		 
		 System.out.println();
		 
		 int no=541;
		 int sm=0;
		 do {
			 int rem = no % 10;
			 sm = sm + rem;
			 no = no / 10;
		 } while(no>0);
		 System.out.println("sum of digit using do-while "+sm);
		 
		 System.out.println();
		 
		 for(int i=1; i<=10; i++) {
			 if(i==5)
				 break;
			 System.out.print(i+" ");
		 }
		 
		 System.out.println();
		 
		 for(int k=1; k<=10; k++) {
			 if(k%3 == 0) continue;
			 System.out.print(k+" ");
		 }
		 
		 System.out.println();
		 
		 for (int i = 1; i <= 10; i++) {
			 if (i % 2 == 0) continue;
			 System.out.print(i+" ");
			 }
	}

}
