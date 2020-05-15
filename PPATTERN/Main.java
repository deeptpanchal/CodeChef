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
			int a[][] = new int[n][n];
			int count = 0;
			for (int sum = 0; sum <= 2 * (n - 1); sum++)
			{
				for (int i = 0; i < n; i++) 
				{
					for (int j = 0; j < n; j++)
					{
						if (i + j == sum)
						{
							a[i][j] = ++count;
						}
					}
				}
			}
			for (int i = 0; i < n; i++) 
			{
				for (int j = 0; j < n; j++) 
				{
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
		}
		s.close();
	}
}
