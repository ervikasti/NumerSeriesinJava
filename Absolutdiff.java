import java.util.Scanner;
class Absolutdiff 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter a number");
		int no = s1.nextInt();
		int diff = no-21;
		if (diff<0)
		{
			diff = diff*(-1);
			
		}
		if (no<=21)
		{
		System.out.println("IF"+diff);
		}
		else{
			System.out.println(2*diff);
		}
	}
}
