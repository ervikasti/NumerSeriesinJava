import java.util.Scanner;
class AreaOfTriangle
{
	public static void main(String [] args)
	{	System.out.print("Enter Base : ");
		Scanner s1 = new Scanner(System.in);
		int base = s1.nextInt();
		System.out.print("Enter Height : ");
		int height = s1.nextInt();
		System.out.println("Area of Triangle is :"+ 0.5*(base*height));
	}
}