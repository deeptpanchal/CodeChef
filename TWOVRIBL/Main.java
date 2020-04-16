import java.util.*;

public class Main 
{
	static int solve(int n) 
	{
		long x = 0;
		long y = 0;
		int count = 0;
		while (x <= n) 
		{
			x = (long) Math.sqrt(y) + 1;
			y = y + x * x;
			count++;
		}
		return count - 1;
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
