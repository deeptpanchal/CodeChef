import java.util.*;

public class Main 
{
	public static String solve(long n) 
	{
		int count_0 = 0;
		int count_2 = 0;
		while (n % 10 == 0) 
		{
			count_0++;
			n /= 10;
		}
		while (n % 2 == 0) 
		{
			count_2++;
			n /= 2;
		}
		return (n == 1 && count_2 <= count_0) ? "Yes" : "No";
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
