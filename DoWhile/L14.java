import java.util.Scanner;

class L14
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		//To verify number is Arm Strong number
		System.out.println("Enter a number");
		int num = s.nextInt();
		int temp = num;
		int count = 0;

		do{
			count++;
			temp = temp/10;
		}while(temp >0);

		temp = num;

		int sum = 0;
		do{
			int pow = count;
			int prod = 1;
			int digit = temp%10;

			do{
			prod = prod*digit;
			pow--;
			}while(pow>0);

			sum =sum + prod;
			temp = temp/10;
		}while(temp>0);

		if(sum == num)
		{
			System.out.println("Amstrong Number");
		}
		else{
			System.out.println("Not Amstrong Number");
		}


	}
}