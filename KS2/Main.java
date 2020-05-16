import java.util.*;

public class Main 
{
	static int sum(long n) 
	{
		int sum = 0;
		for (long i = n; i > 0; i = i / 10) 
		{
			sum = (int) (sum + i % 10);
		}
		return sum;
	}

	static String solve(long n) 
	{
		int t = sum(n) % 10;
		return n + "" + (t == 0 ? 0 : 10 - t);
	}

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			long n = s.nextLong();
			System.out.println(solve(n));
		}
		s.close();
	}
}
