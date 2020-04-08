import java.util.*;

public class Main 
{
	static long solve(int n) 
	{
		long sum = 0;
		for (int i = 1; i <= Math.sqrt(n); i++) 
		{
			if (n % i == 0) 
			{
				sum = sum + i + n / i;
				if (i * i == n) 
				{
					sum = sum - i;
				}
			}
		}
		return sum;
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
