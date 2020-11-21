import java.util.Scanner;

public class A51 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two values");        int no1 = s.nextInt();
		int no2 = s.nextInt();
		if(((no1>=30 && no1<=40)&&(no2>=30 && no2<=40)) || !((no1>40 && no1 <50)&&(no2>40 && no2<50)))
		{
			System.out.println("Yes");
		}
	}
}