import java.util.Scanner;
class A56Squirel 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		boolean wd = s.nextBoolean();
		int  cigar = s.nextInt();

		
		if(wd && (cigar>=40 && cigar<=60) || (!wd && cigar>40))
			{
				System.out.println("Successful");	
			 }
		else {
				 System.out.println("Unsuccessful");
			 }
				



			
	}
}
