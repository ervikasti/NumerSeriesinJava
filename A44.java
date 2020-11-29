import java.util.Scanner;
class A44
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("----- Program will CHECK no. EVEN or ODD -----");
		System.out.println("Enter a number");
		int num1 = s.nextInt();

		if (num1%2==0)
		{
			System.out.println("EVEN");
		}
		else
		{
			System.out.println("ODD");
		}
	}
}