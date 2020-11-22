import java.util.Scanner;

class L3
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		//Program to print in desc ordering
		System.out.println("Program to print in desc order");

		System.out.println("Enter Upper range");
		int upper = s1.nextInt();
		System.out.println("Enter Lower range");
		int lower = s1.nextInt();


		if (lower>upper)
		{
			int temp = lower;
			lower = upper;
			upper = temp;
		}
		do{
			System.out.println(upper);
			upper--;
		}while(lower<=upper);
		
	}
}