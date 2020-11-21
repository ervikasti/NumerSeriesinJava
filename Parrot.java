// Jvdroid-main: 
import java.util.Scanner;
public class Parrot{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter is parrot taking");
		boolean talk = s.nextBoolean();
		System.out.println("Enter Time");
		int hr = s.nextInt();

		if (talk && (hr <= 7 || hr >= 20)) {
			System.out.println("We are in trouble");
		} else {
			System.out.println("Relax");
		}
	}
}