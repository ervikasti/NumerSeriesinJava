import java.util.Scanner;
class A43
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("----- Program will CHECK no. +ve or -ve -----");
		System.out.println("Enter a number");
		int num1 = s.nextInt();

		if (num1>0)
		{
			System.out.println("POSITIVE +VE");
		}
		else
		{
			System.out.println("NEGATIVE -VE");
		}
	}
}