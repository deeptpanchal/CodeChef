import java.util.*;

public class Main 
{
	static long sum(long temp) 
	{
		if (temp == 12 || temp == 16 || temp == 18 || (temp >= 20 && temp != 23)) 
		{
			temp = solve(temp);
		}
		return temp;
	}

	static long solve(long n) 
	{
		return Math.max(n, sum(n / 2) + sum(n / 3) + sum(n / 4));
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		while (s.hasNextInt()) 
		{
			long n = s.nextLong();
			System.out.println(solve(n));
		}
		s.close();
	}
}
