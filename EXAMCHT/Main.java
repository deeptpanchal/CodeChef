import java.util.*;

public class Main 
{
	public static int solve(int a, int b) 
	{
		int n = Math.abs(a - b);
		if (n == 0) 
		{
			return -1;
		}
		int count = 0;
		for (int i = 1; i <= Math.sqrt(n); i++) 
		{
			if (i * i == n) 
			{
				count += 1;
			} 
			else if (n % i == 0) 
			{
				count += 2;
			}
		}
		return count;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int a = s.nextInt();
			int b = s.nextInt();
			System.out.println(solve(a, b));
		}
		s.close();
	}
}
