import java.util.Scanner;
public class A62 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter a start and end limit ");
		int l= s1.nextInt();
		int u = s1.nextInt();
		
		do
		{
			if(l%2!=0)
				{
					System.out.println(l);	
				}
			l++;
		}while(l<=u);
	}
}