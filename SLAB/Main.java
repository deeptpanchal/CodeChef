import java.util.*;

public class Main
{
	static int solve(int n) 
	{
		int sum = 0;
		if (n > 1500000) 
		{
			sum = sum + (n - 1500000) * 30 / 100;
		}
		if (n > 1250000) 
		{
			sum = sum + (Math.min(n, 1500000) - 1250000) * 25 / 100;
		}
		if (n > 1000000)
		{
			sum = sum + (Math.min(n, 1250000) - 1000000) * 20 / 100;
		}
		if (n > 750000) 
		{
			sum = sum + (Math.min(n, 1000000) - 750000) * 15 / 100;
		}
		if (n > 500000) 
		{
			sum = sum + (Math.min(n, 750000) - 500000) * 10 / 100;
		}
		if (n > 250000)
		{
			sum = sum + (Math.min(n, 500000) - 250000) * 5 / 100;
		}
		return n - sum;
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
