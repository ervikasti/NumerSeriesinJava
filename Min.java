class Min
{ 	public static void main (String [] args)
	{
	int a = 10;
	int b = 20;
	int c =5;
	int ans = a<b?(a<c?a:c):(b<c?b:c);
	System.out.println("Min no is "+ans);
	}
}