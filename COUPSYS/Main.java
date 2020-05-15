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
			int ans[][] = new int[3][2];
			for (int i = 0; i < n; i++) 
			{
				int c = s.nextInt();
				int l = s.nextInt();
				int x = s.nextInt();
				if (x > ans[l - 1][0])
				{
					ans[l - 1][0] = x;
					ans[l - 1][1] = c;
				}
				else if (x == ans[l - 1][0]) 
				{
					ans[l - 1][1] = Math.min(ans[l - 1][1], c);
				}
			}
			for (int i = 0; i < 3; i++) 
			{
				System.out.println(ans[i][0] + " " + ans[i][1]);
			}
		}
		s.close();
	}
}
