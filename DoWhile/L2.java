import java.util.Scanner;

class L2
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Lower range");
		int lower = s1.nextInt();
		System.out.println("Enter Upper range");
		int upper = s1.nextInt();

		if (lower>upper)
		{
			int temp = lower;
			lower = upper;
			upper = temp;
		}
		do{
			System.out.println(lower);
			lower++;
		}while(lower<=upper);
		
	}
}