import java.util.Scanner;
class choclate
{
	 public static void main(String [] args)
		{	
			Scanner ref =  new Scanner(System.in);
			System.out.print("Enter total amount ");
			float Amount = ref.nextFloat();
			System.out.print("Enter quantity ");
			float OneChoclate = ref.nextFloat();
			System.out.println("Total No. of choclate is :"+ Amount/OneChoclate);
			System.out.print("Amount Remaning :"+ Amount%OneChoclate);
		}
}
