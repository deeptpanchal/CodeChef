import java.util.*;

public class Main 
{
	static int solve(int n, int k) 
	{
		int max = 0;
		for (int i = 1; i <= k; i++) 
		{
			max = Math.max(max, n % i);
		}
		return max;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) 
		{
			int n = s.nextInt();
			int k = s.nextInt();
			System.out.println(solve(n, k));
		}
		s.close();
	}
}
