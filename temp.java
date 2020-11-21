import java.util.Scanner;
public class temp{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter temp1 e");
		int temp1 = s.nextInt();
		System.out.println("Enter temp2");
		int temp2 = s.nextInt();
		if((temp1<0 && temp2>100)||(temp2<0 && temp1>100))
		{
			System.out.println("True");
		}
		else{
		System.out.println("False");
		}
	}
}