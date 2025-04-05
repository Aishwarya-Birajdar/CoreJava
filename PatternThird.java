package BasicProgram;

public class PatternThird {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++)
		{
			for(int j=4; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 2nd
		System.out.println();
		
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print("*");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
		
		// 3rd
		System.out.println();
		
		for(int i=1; i<=5; i++)
		{
			for(int j=4; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int k=5; k>=i; k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		// 4th
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// 5th
		System.out.println();
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print(" ");
			}
			for(int k=5; k>=i; k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//6th
		System.out.println();
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			for(int l=2; l<=i; l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 7th
		System.out.println();
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=(i*2); k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// 8th
		System.out.println();
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1; i<=6; i++)
		{
			for(int j=2; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int k=6; k>=i; k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// 9th
		System.out.println();
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int k=4; k>=i; k--)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}

}
