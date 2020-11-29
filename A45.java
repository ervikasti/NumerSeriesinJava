import java.util.Scanner;
class A45
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("----- Program will CHECK no. is MULTIPLE of 3,4,7 -----");
		System.out.println("Enter a number");
		int num1 = s.nextInt();

		if (num1%3==0 || num1%4==0 || num1%7==0)
		{
			System.out.println("NUMBER  IS MULTIPLE ");
		}
		else
		{
			System.out.println("NOT MULTIPLE");
		}
	}
}