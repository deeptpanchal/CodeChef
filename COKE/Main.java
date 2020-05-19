import java.util.*;

public class Main 
{
	static boolean temp(int m, int k, int l, int r, int c) 
	{
		int temp = c;
		for (int i = 0; i < m; i++) 
		{
			temp = temp > k + 1 ? --temp : temp < k - 1 ? ++temp : k;
		}
		return l <= temp && temp <= r;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			int m = s.nextInt();
			int k = s.nextInt();
			int l = s.nextInt();
			int r = s.nextInt();
			int min = 10000000;
			for (int i = 0; i < n; i++)
			{
				int c = s.nextInt();
				int p = s.nextInt();
				if (temp(m, k, l, r, c)) 
				{
					min = Math.min(min, p);
				}
			}
			System.out.println(min == 10000000 ? -1 : min);
		}
		s.close();
	}
}
