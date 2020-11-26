import java.util.Scanner;
public class A71{
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("* PROGRAM WILL PRINT ARMSTRONG NUMBER *");
		System.out.print("Enter a start and end limit ");
		int lower = s1.nextInt();
		int upper = s1.nextInt();
		int temp = 0;


		
		do
		  { 
			int count = 0;
		    temp = lower;
			int sum = 0;

			do
			  {
				count++;
				temp = temp/10;

			  }while(temp>0);

			temp = lower;

			do
			{
				int digit = temp%10;
				//System.out.println("unit "+digit);
				
				int prod = 1;
				//System.out.print("count "+count);
				int pow = count;

				while(pow>0)
				{
					prod = prod*digit;
					pow--;
				}
				sum = sum+prod;
				//System.out.println("product "+prod);
				//System.out.println("sum "+sum);

				temp = temp/10;
				//System.out.println("tempno/10 "+temp);
			}while(temp>0);
			//System.out.print("sum "+sum);
			//System.out.println("lower "+lower);
			if(sum == lower)
			{	
				System.out.println(sum);
			}

			lower++;
			 
		  }while(lower<=upper);	
	}

}
	
			