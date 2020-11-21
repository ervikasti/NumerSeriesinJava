import java.util.Scanner;

public class A52 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two values");        int no1 = s.nextInt();
		int no2 = s.nextInt();
		if( no1%10== no2%10)
		{
			System.out.println("Same last digit");
		}
		else{
			System.out.println("Different last digit");
		}
	}
}