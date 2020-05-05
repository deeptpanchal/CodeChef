import java.util.*;

public class Main 
{
	static long solve(int n, int b, long m) 
	{
		long time = 0;
		while (n != 1) 
		{
			int temp = (n + 1) / 2;
			time = time + b + m * temp;
			n = n - temp;
			m = 2 * m;

		}
		return time + m;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			int b = s.nextInt();
			int m = s.nextInt();
			System.out.println(solve(n, b, m));
		}
		s.close();
	}
}
