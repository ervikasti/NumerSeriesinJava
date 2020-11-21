import java.util.Scanner;
class A57
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Is your Birtday True or False");
		boolean bithday = s.nextBoolean();
		System.out.println("ENter speed");
		int  speed = s.nextInt();

		
		if(bithday)
			{
				speed = speed-8;	
			 }
		if (speed<=60)
		{
			System.out.println("No ticket");
		}
		else if (speed>=61 && speed<=80)
		{
			System.out.println("Small Ticket");
		}
		else{
			System.out.println("Big Ticket");
		}
				



			
	}
}
