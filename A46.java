import java.util.Scanner;
class A46
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("----- Program will CHECK CHARACTER is in UC,LC,SPECIAL,NUMBER -----");
		System.out.println("Enter a character");
		char ch = s.next().charAt(0);

		if (ch>='A' && ch<='Z')
		{
			System.out.println("UPPER CASE ");
		}
		else if (ch>='a' && ch<='z')
		{
			System.out.println("LOWER CASE ");
		}
		else if (ch>='0' && ch<='9')
		{
			System.out.println("NUMBER ");
		}
		else
		{
			System.out.println("SPECIAL CHARACTER");
		}
	}
}