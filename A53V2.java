import java.util.Scanner;
class A53V2
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 2 vales after press enter");
		int no1 = s.nextInt();
		int no2 = s.nextInt();
		int diff1  = no1-10;
		int diff2 = no2-10;
		if (diff1<0)
		{diff1 = diff1*-1;
		}
		if (diff2<0)
		{diff2 = diff2*-1;
		}
		if ((diff1)>(diff2))
		{System.out.println("if 3 loop");
		}
		else
		{System.out.println("else no1 is closer");
		}
	}
}
