import java.util.Scanner;

class L15
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		//To verify number isPrime or not
		System.out.println("Enter a number");
		int num = s.nextInt();
		int i =2;

		do{
			if (num%2 == 0)
			{
				break;
			}
			i++;
		}while(i<num);

		if(num == i){
		System.out.println(" prime no");
		}
		else{
			System.out.println("Not a prime ");
		}
	}
}