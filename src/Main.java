public class Main 
{
	public static void main(String[] args)
	{
		bizz(3);
		buzz(5);
	}
	
	public static void bizz(int n)
	{
		if(n % 3 == 0)
		{
			System.out.println("BIZZ");
		}
	}
	
	public static void buzz(int n)
	{
		if(n % 5 == 0)
		{
			System.out.println("BUZZ");
		}
	}
}
