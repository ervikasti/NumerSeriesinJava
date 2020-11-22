import java.util.Scanner;

class L11
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		//To verify no is STRONG number or Not
		System.out.println("Enter a number");
		int num = s.nextInt();
		int temp = num;
		int sum = 0;


		do{
			int digit = temp%10;

		    int fact = 1;
			do{
				fact = fact*digit;
				digit--;
			}while(digit>0);

			sum = sum + fact;
			temp = temp/10;

		}while(temp>0);

		if (sum == num)
		{
			System.out.println("Strong number");
		}
		else {
			System.out.println("Not a Strong number");
		}

	}
}