import java.util.Scanner;

class L8 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s.nextInt();
		int fact=1;
		
		if (num > 0)
		{
			do{
				fact = fact*num;
				num--;
			}while(num>0);

		}
		
		System.out.println(fact);
	}
}
