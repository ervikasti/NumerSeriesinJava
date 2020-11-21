import java.util.Scanner;

public class week{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Is week day");
		boolean wd = s.nextBoolean();
		System.out.println("Is vacation");
		boolean vac = s.nextBoolean();

		if ( !vac && wd) {
			System.out.println("Working");
		} else {
			System.out.println("Vacation");
		}
	}
}