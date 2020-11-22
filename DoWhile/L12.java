import java.util.Scanner;

class L12
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		//To verify no is Special number or Not
		System.out.println("Enter a number");
		int num = s.nextInt();
		int temp = num;
		int sum = 0;
		int prod = 1;

		do{
			int digit = temp%10;

			sum = sum + digit;
			prod = prod * digit;
			temp= temp/10;
		}while(temp>0);

		if (num == (sum+prod))
		{
			System.out.println(" Special number");
		}
		else{
			System.out.println("Not a  Special number");
		}

	}
}



