import java.util.*;

public class Main 
{
	public static String check(int n) 
	{
		if (n == 1) 
		{
			return "no";
		}
		for (int i = 2; i <= Math.sqrt(n); i++) 
		{
			if (n % i == 0) 
			{
				return "no";
			}
		}
		return "yes";
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			System.out.println(check(s.nextInt()));
		}
		s.close();
	}
}
