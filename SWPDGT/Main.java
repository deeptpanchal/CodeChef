import java.util.*;

public class Main 
{
	static int sum(int n)
	{
		return n / 10 + n % 10;
	}

	static int solve(int a, int b)
	{
		int ans = a + b;
		if (a > 9)
		{
			ans = Math.max(ans, sum(b) * 10 + sum(a));
		}
		if (b > 9) 
		{
			ans = Math.max(ans, sum(a) * 10 + sum(b));
		}
		return ans;
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
