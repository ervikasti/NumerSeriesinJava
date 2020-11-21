import java.util.Scanner;
public class A66{
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter a number");
		int no = s1.nextInt();
		
		while(no>0)
		{ 
		    int digit = no%10;
			if(digit%2==0){
			System.out.println(digit);
			}
			no = no/10;
		}
	}
}