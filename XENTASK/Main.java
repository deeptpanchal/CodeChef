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
			int time1 = 0;
			int time2 = 0;
			int x[] = new int[n];
			int y[] = new int[n];
			for (int i = 0; i < n; i++)
			{
				x[i] = s.nextInt();
				if (i % 2 == 0)
				{
					time1 = time1 + x[i];
				}
				else
				{
					time2 = time2 + x[i];
				}
			}
			for (int i = 0; i < n; i++)
			{
				y[i] = s.nextInt();
				if (i % 2 == 1)
				{
					time1 = time1 + y[i];
				}
				else
				{
					time2 = time2 + y[i];
				}
			}
			System.out.println(Math.min(time1, time2));
		}
		s.close();
	}
}
