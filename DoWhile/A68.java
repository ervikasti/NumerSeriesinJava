import java.util.Scanner;
public class A68{
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("* PROGRAM WILL PRINT SUM OF DIGITS *");
		System.out.print("Enter a number : ");

		int no = s1.nextInt();
		System.out.println("OUTPUT are ");
		int sum = 0;
		do
		{ 
		    int digit = no%10;
			sum = sum + digit;
			no = no/10;
		}while(no>0);
		System.out.println(sum);
	}
}