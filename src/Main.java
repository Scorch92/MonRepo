public class Main 
{
	public static void main(String[] args)
	{
		biuzz(5);
	}
	
	public static void biuzz(int n)
	{
		if(n % 5 == 0)
		{
			System.out.println("BUZZ");
		}
		else if(n % 3 == 0)
		{
			System.out.println("BIZZ");
		}
	}
}
