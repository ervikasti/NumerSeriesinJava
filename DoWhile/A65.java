import java.util.Scanner;
public class A65{
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter a start and end limit ");
		int l= s1.nextInt();
		int u = s1.nextInt();
		int prod = 1;
		
		do
		{
			if(l%2!=0){
			prod = prod*l;
			}
			l++;
		}while(l<=u);
		System.out.println(prod);
	}
}