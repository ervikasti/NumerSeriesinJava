import java.util.Scanner;

class A73
{
	public static void main(String[] args) 
	{
		 Scanner s= new Scanner(System.in);

		System.out.println("---- Program will Print PRIME NUMBER in desc  of given range ----");
		System.out.println("Enter n th number :" );
		int end = s.nextInt();

		while(end>0){

			int i =2;

			while(i<end){
				if (end%2 == 0)
				{
					break;
				}
				i++;
			}

			if(end == i)
				{
					System.out.println(" prime no :"+end);
				}

		
		end--;

		}

	}
}