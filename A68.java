import java.util.Scanner;
public class A68{
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter a number");
		int no = s1.nextInt();
		int sum = 0;
		while(no>0)
		{ 
		    int digit = no%10;
			sum = sum + digit;
			no = no/10;
		}
		System.out.println(sum);
	}
}