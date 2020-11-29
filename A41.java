import java.util.Scanner;
class A41 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("----- Program will print HAPPY is any no. is 10 or sum of two number is 10 -----");
		System.out.println("Enter a number");
		int num1 = s.nextInt();
		System.out.println("Enter another number");
		int num2 = s.nextInt();

		if (num1 ==10 || num2 == 10 || num1+num2==10)
		{
			System.out.println("HAPPY");
		}
		else
		{
			System.out.println("NOT HAPPY");
		}
	}
}