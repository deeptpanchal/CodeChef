import java.util.*;

public class Main 
{
	static int solve(int n) 
	{
		int count = 0;
		for (int i = 1; i * i <= n; i++) 
		{
			if (n % i == 0) 
			{
				if (check(i)) 
				{
					count++;
				}
				if (i * i != n && check(n / i)) 
				{
					count++;
				}
			}
		}
		return count;
	}

	static boolean check(int x) 
	{
		return String.valueOf(x).chars().anyMatch(ch -> ch == '4' || ch == '7');
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int O = s.nextInt();
		while (O-- > 0) 
		{
			int n = s.nextInt();
			System.out.println(solve(n));
		}
		s.close();
	}
}
