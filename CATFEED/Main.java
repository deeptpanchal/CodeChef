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
			int m = s.nextInt();
			int a[] = new int[n];
			boolean bool = true;
			for (int i = 0; i < m; i++) 
			{
				int t = s.nextInt() - 1;
				a[t]++;
				if (a[t] > i / n + 1)
				{
					bool = false;
				}
			}
			System.out.println(bool ? "YES" : "NO");
		}
		s.close();
	}
}
