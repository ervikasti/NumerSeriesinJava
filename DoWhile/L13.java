import java.util.Scanner;

class L13
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		//To find Nth power of a given number
		System.out.println("Enter a number");
		int num = s.nextInt();
		System.out.println("Enter a power");
		int pow = s.nextInt();
		int prod =  1;

		do{
			 prod = prod*num;

			 pow--;

		}while(pow>0);

		System.out.println("The power is "+prod);
	}
}