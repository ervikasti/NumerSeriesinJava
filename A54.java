import java.util.Scanner;
class A54 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		if( (a>=13 && a<=19 && a!=15) || (b>=13 && b<=19 && b!=15) || (c>=13 && c<=19 && c!=15) ){

		System.out.println("Yes");

		}
		else{
			System.out.println("No");
		}
	}
}
