import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		if (n % 3 == 0 || n % 6 == 1) 
		{
			System.out.println("yes");
		} 
		else 
		{
			System.out.println("no");
		}
		s.close();
	}
}
