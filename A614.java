import java.util.Scanner;
public class A614{
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter a start and end limit ");
		int lower = s1.nextInt();
		int upper = s1.nextInt();
		int temp = 0;
		int totalsum = 0;

		
		while(lower<=upper)
		  { 
			temp = lower;
			int sum = 0;
			int prod = 1;
			while(temp>0)
			{
				int digit = temp%10;

				sum = sum+digit;
				prod = prod*digit;
				temp = temp/10;
			}
			
			if(lower == (sum+prod))
			{
				totalsum = totalsum+lower;
				System.out.println(lower);
			}

			lower++;
		  }	
		System.out.println(totalsum);
		
	}

}
	
			