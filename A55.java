import java.util.Scanner;
class A55 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		char ch = s.next().charAt(0);

		
		if(ch>='A' && ch<='Z')
			{
			 if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' )
			 {
				System.out.println("Ch is Upper Case and a vowel");	
			 }
			 else {
				 System.out.println("Ch is Upper Case and a consonant");
			 }
			}	

		if(ch>='a' && ch<='z')
			{
			 if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
			 {
				System.out.println("Ch is Lower Case and a vowel");	
			 }
			 else {
				 System.out.println("Ch is lower Case and a consonant");
			 }
			}
			
		else if (ch>='0' && ch<='9')
				{
					System.out.println("Ch is a number");
				}
		else{
			System.out.println("Ch is a special character");
			}
			
	}
}
