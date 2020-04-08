import java.util.*;

public class Main 
{
	static boolean prime(int x) 
	{
		if (x < 2) 
		{
			return false;
		}
		for (int i = 2; i * i <= x; i++) 
		{
			if (x % i == 0) 
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int O = s.nextInt();
		while (O-- > 0) 
		{
			int n = s.nextInt();
			int m = s.nextInt();
			for (int i = n; i <= m; i++) 
			{
				if (prime(i)) 
				{
					System.out.println(i);
				}
			}
			System.out.println();
		}
		s.close();
	}
}
