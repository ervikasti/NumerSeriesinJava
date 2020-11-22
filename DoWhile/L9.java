import java.util.Scanner;

class L9
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		//To print each digit of a number
		System.out.println("Enter a number");
		int num = s.nextInt();

		do{
			int digit = num%10;
			System.out.print(digit);
			num = num/10;

		}while(num!=0);

		

	}
}
