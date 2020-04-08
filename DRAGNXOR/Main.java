import java.util.*;

public class Main 
{
	static int count(int temp) 
	{
		int count = 0;
		for (int i = temp; i > 0; i /= 2) 
		{
			if (i % 2 == 1) {
				count++;
			}
		}
		return count;
	}

	static long ans(int temp, int n) 
	{
		long ans = 0;
		for (int i = 0; i < temp; i++) 
		{
			ans += (long) Math.pow(2, --n);
		}
		return ans;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int O = s.nextInt();
		while (O-- > 0) {
			int n = s.nextInt();
			int a = s.nextInt();
			int b = s.nextInt();
			int temp = count(a) + count(b);
			if (temp <= n) 
			{
				System.out.println(ans(temp, n));
			} 
			else 
			{
				System.out.println(ans(2 * n - temp, n));
			}
		}
		s.close();
	}
}
