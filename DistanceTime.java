import java.util.Scanner;
class DistanceTime
{
	 public static void main(String [] args)
		{
			//speed=distance/time
			Scanner ref =  new Scanner(System.in);
			System.out.print("Enter total distance ");
			float dist = ref.nextFloat();
			System.out.println("Case 1");
			System.out.print("Enter speed");
			int s1 = ref.nextInt();
			float Time1 = dist/s1;
			System.out.println("Time to Reach SriLanka = "+ Time1+" hr");
			System.out.println("Case 2");
			System.out.print("Enter speed");
			int s2 = ref.nextInt();			
			float Time2 = dist/s2;
			System.out.println("Time to Reach Back = "+Time2+ " hr");
			System.out.println("Case 3");
			System.out.print("Enter total party time");
			int party = ref.nextInt();	
			System.out.println("Total time taken is = "+ (Time1+Time2+party) +" hrs");
		}
}
