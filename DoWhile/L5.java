import java.util.Scanner;

class L5
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		//Program to count no. of even in given range


		System.out.println("Enter Lower range");
		int lower = s1.nextInt();
		System.out.println("Enter Upper range");
		int upper = s1.nextInt();

		int count = 0;
		if (lower>upper)
		{
			int temp = lower;
			lower = upper;
			upper = temp;
		}
		do{
			if (lower%2==0)
			{
				count++;
			}
			
			lower++;
		}while(lower<=upper);
		System.out.println("Toatal count of even no is: "+count);
		
	}
}