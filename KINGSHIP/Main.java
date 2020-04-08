import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int O = s.nextInt();
		while (O-- > 0) 
		{
			int n = s.nextInt();
			long a[] = new long[n];
			long min = Long.MAX_VALUE;
			for (int i = 0; i < n; i++) 
			{
				a[i] = s.nextLong();
				min = Math.min(min, a[i]);
			}
			long ans = -min * min;
			for (int i = 0; i < n; i++) 
			{
				ans += a[i] * min;
			}
			System.out.println(ans);
		}
		s.close();
	}
}
