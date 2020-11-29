import java.util.Scanner;
class A42
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("----- Program will print TRUE is any no. is +ve and FALSE if both number is +ve or -ve -----");
		System.out.println("Enter a number");
		int num1 = s.nextInt();
		System.out.println("Enter another number");
		int num2 = s.nextInt();

		if ((num1<0 && num2<0)||(num1>0 && num2>0))
		{
			System.out.println("FALSE");
		}
		else
		{
			System.out.println("TRUE");
		}
	}
}