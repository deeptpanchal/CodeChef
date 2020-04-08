import java.util.*;
public class Main
{
	static long solve(long n)
	{
		long sum = 0;
		for(long i = 1 ; i <= Math.sqrt(n) ; i++)
		{
			if(i*i == n)
			{
				sum = sum + (i%2==1?i:0);
			}
			else if(n % i == 0)
			{
				sum = sum + (i%2==1?i:0) + (n/i%2==1?n/i:0);
			}
		}
		return sum;
	}
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int O = s.nextInt();
		while(O-->0)
		{
			long n = s.nextLong();
			long m = s.nextLong();
			long sum = 0;
			for(long i = n ; i <= m ; i++)
			{
				sum = sum + solve(i);
			}
			System.out.println(sum);
		}
		s.close();
	}
}
