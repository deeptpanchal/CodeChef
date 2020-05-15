import java.util.*;

public class Main 
{
	static boolean check(int n) 
	{
		int count = 0;
		for (int i = n; i > 0; i = i / 10) 
		{
			if (i % 10 == 3) 
			{
				count++;
				if (count == 3) 
				{
					return true;
				}
			}
		}
		return false;
	}

	static int solve(int n) 
	{
		for (int i = n + 1;; i++)
		{
			if (check(i))
			{
				return i;
			}
		}
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			System.out.println(solve(n));
		}
		s.close();
	}
}
