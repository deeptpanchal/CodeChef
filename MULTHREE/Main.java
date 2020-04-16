import java.util.*;

public class Main 
{
	static String solve(long k, int d0, int d1) 
	{
		long sum = 0;
		int d2 = (d0 + d1) % 10;
		sum = d0 + d1 + d2;
		k = k - 3;
		int d3 = (2 * (d0 + d1)) % 10;
		int d4 = (4 * (d0 + d1)) % 10;
		int d5 = (8 * (d0 + d1)) % 10;
		int d6 = (6 * (d0 + d1)) % 10;
		sum = sum + (k / 4) * (d3 + d4 + d5 + d6);
		if (k % 4 == 1) 
		{
			sum = sum + d3;
		}
		if (k % 4 == 2) 
		{
			sum = sum + d3 + d4;
		}
		if (k % 4 == 3) 
		{
			sum = sum + d3 + d4 + d5;
		}
		if (sum % 3 == 0) 
		{
			return "YES";
		}
		return "NO";
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			long k = s.nextLong();
			int d0 = s.nextInt();
			int d1 = s.nextInt();
			System.out.println(solve(k, d0, d1));
		}
		s.close();
	}
}
