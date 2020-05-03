import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) 
		{
			int n = s.nextInt();
			int x[] = new int[n];
			int y[] = new int[n];
			int ans = 0;
			for (int i = 0; i < n; i++) 
			{
				x[i] = s.nextInt();
				y[i] = s.nextInt();
				ans = ans ^ (i + 1);
			}
			System.out.println(ans);
		}
		s.close();
	}
}
