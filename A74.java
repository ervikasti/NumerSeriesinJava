import java.util.Scanner;

class A74
{
	public static void main(String[] args) 
	{
		 Scanner s= new Scanner(System.in);

		System.out.println("---- Program will Print sum of digits of PRIME NUMBER in given range ----");
		System.out.println("Enter start  number :" );
		int start = s.nextInt();
		System.out.println("Enter end  number :" );
		int end = s.nextInt();

		while(start<=end){

			int i =2;

			while(i<start){
				if (start%2 == 0)
				{
					break;
				}
				i++;
			}

			if(start == i)
				{
				int sum = 0;
					while (i>0)
					{
						int digit = i%10;
						sum = sum + digit;
						i = i/10;
					}
					
					System.out.println("  sum of each digit prime number is  :"+sum);
				}

		
		start++;

		}

	}
}