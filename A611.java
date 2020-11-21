import java.util.Scanner;
public class A611{
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter a number");
		int no = s1.nextInt();
		int prod = 1;
		while(no>0)
		{ 
		    int digit = no%10;
		    if(digit%2!=0){
			prod = prod*digit;}
			no = no/10;
		}
		System.out.println(prod);
	}
}

