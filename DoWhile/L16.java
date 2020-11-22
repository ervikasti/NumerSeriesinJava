import java.util.Scanner;
class L16 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		//FIbonacci Series
		System.out.println("Enter a number");
		int num = s.nextInt();
		int a=0;
		int b=1;
		System.out.print(" "+a);
		System.out.print(" "+b);
		do{
			int c = a+b;
			a = b;
			b = c;
			System.out.print(" "+c);
			num--;
		}while(num>=1);


	}
}
