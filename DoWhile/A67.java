import java.util.Scanner;
public class A67{
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println(" * PROGRAM WILL PRINT ODD NO OF DIGITS *");
		System.out.print("Enter a number : ");

		int no = s1.nextInt();
		System.out.println("OUTPUT are ");
		
		do
		{ 
		    int digit = no%10;
			if(digit%2!=0){
			System.out.println(digit);
			}
			no = no/10;
		}while(no>0);
	}
}