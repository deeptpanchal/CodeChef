import java.util.*;

public class Main 
{
	static long solve(long n1, long n2, long m) 
	{
		long sum = m * (m + 1) / 2;
		if (sum >= Math.min(n1, n2)) 
		{
			return Math.abs(n1 - n2);
		}
		return n1 + n2 - 2 * sum;
	}

	public static void main(String arga[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			long n1 = s.nextLong();
			long n2 = s.nextLong();
			long m = s.nextLong();
			System.out.println(solve(n1, n2, m));
		}
		s.close();
	}
}
