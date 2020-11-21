import java.util.Scanner;
public class A613{
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter a start and end limit ");
		int lower = s1.nextInt();
		int upper = s1.nextInt();
		int temp = 0;
		int count = 0;
		
		while(lower<=upper)
		  { 
			temp = lower;
			int sum = 0;

			while(temp>0)
			{
				int digit = temp%10;
				//System.out.println("unit "+digit);
				
				int fact = 1;
				while(digit>0)
				{
					fact = fact*digit;
					digit--;
				}
				sum = sum+fact;
				//System.out.println("factorial "+fact);
				//System.out.println("sum "+sum);

				temp = temp/10;
				//System.out.println("tempno/10 "+temp);
			}
			//System.out.print("sum "+sum);
			//System.out.println("lower "+lower);
			if(sum == lower)
			{	
				count = count+1;
			}

			lower++;
			 
		  }	
		 System.out.println("count of strong no is "+ count);
	}

}
	
			