import java.util.*;

public class Main 
{
	static int solve(char a[][], int n, int m) 
	{
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++) 
			{
				if (i % 2 == 0) 
				{
					if (j % 2 == 0)
					{
						if (a[i][j] != 'R') 
						{
							sum1 = sum1 + 3;
						} 
						else
						{
							sum2 = sum2 + 5;
						}
					} 
					else 
					{
						if (a[i][j] != 'G')
						{
							sum1 = sum1 + 5;
						} 
						else
						{
							sum2 = sum2 + 3;
						}
					}
				} 
				else 
				{
					if (j % 2 == 0) 
					{
						if (a[i][j] != 'G') 
						{
							sum1 = sum1 + 5;
						}
						else
						{
							sum2 = sum2 + 3;
						}
					} 
					else 
					{
						if (a[i][j] != 'R') 
						{
							sum1 = sum1 + 3;
						} 
						else 
						{
							sum2 = sum2 + 5;
						}
					}
				}
			}
		}
		return Math.min(sum1, sum2);
	}

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0)
		{
			int n = s.nextInt();
			int m = s.nextInt();
			char a[][] = new char[n][m];
			for (int i = 0; i < n; i++) 
			{
				a[i] = s.next().toCharArray();
			}
			System.out.println(solve(a, n, m));
		}
		s.close();
	}
}
