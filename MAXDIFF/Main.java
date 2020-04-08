import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			int k = s.nextInt();
			int w[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				w[i] = s.nextInt();
			}
			Arrays.sort(w);
			int ans1 = 0;
			int ans2 = 0;
			for (int i = 0; i < n; i++) 
			{
				if (i < k) 
				{
					ans1 -= w[i];
				} 
				else 
				{
					ans1 += w[i];
				}
				if (i < n - k) 
				{
					ans2 += w[i];
				} 
				else 
				{
					ans2 -= w[i];
				}
			}
			System.out.println(Math.max(Math.abs(ans1), Math.abs(ans2)));
		}
		s.close();
	}
}
