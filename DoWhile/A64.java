import java.util.Scanner;
public class A64{
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter a start and end limit ");
		int l= s1.nextInt();
		int u = s1.nextInt();
		int sum = 0;
		
		do
		{
			if(l%2==0 && l%3==0){
			sum = sum+l;
			}
			l++;
		}while(l<=u);
		System.out.println(sum);
	}
}