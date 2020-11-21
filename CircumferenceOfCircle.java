import java.util.Scanner;
class CircumferenceOfCircle
{
	public static void main(String [] args)
	{
		Scanner ref =  new Scanner(System.in);
		System.out.print("Enter radius ");
		int radius = ref.nextInt();
		float pi = 22.0f/7;
		System.out.println("Circumference of circle is : "+ 2*pi*radius);
	}
}