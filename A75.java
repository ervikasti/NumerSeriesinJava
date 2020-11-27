import java.util.Scanner;

class A75
{
	public static void main(String[] args) 
	{
		 Scanner s= new Scanner(System.in);

		System.out.println("---- Program will Print sum of factorial digits of NON PRIME NUMBER in given range ----");
		System.out.println("Enter start  number :" );
		int start = s.nextInt();
		System.out.println("Enter end  number :" );
		int end = s.nextInt();

		while(start<=end)
			{

			int i =2;

			while(i<start){
				if (start%2 == 0)
				{
					break;
				}
				i++;
			}

			if(start != i)
				{
				int num1 = start;
				int sum = 0;

					while (num1>0)
					{	int fact = 1;
						int digit = num1%10;
						
						while (digit>0)
						{
							fact = fact*digit;
							digit--;
						}
						

						sum = sum + fact;
						num1 = num1/10;
					}
					
					System.out.println("  sum of factorial each digit of Non-prime number is  :"+sum);
				}

		
		start++;

		}

	}
}