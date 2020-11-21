import java.util.Scanner;
public class A63{
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter a start and end limit ");
		int l= s1.nextInt();
		int u = s1.nextInt();
		int count=0;
		
		while(l<=u)
		{
			if(l%2!=0){
			count++;}
			l++;
		}
		System.out.println(count);
	}
}