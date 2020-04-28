import java.util.*;

public class Main 
{
	static String solve(int a[][], int r, int c) 
	{
		for (int i = 0; i < r; i++) 
		{
			boolean row = i == 0 || i == r - 1;
			for (int j = 0; j < c; j++) 
			{
				boolean col = j == 0 || j == c - 1;
				if (row && col && a[i][j] > 1) 
				{
					return "Unstable";
				}
				if (row ^ col && a[i][j] > 2) 
				{
					return "Unstable";
				}
				if (!row && !col && a[i][j] > 3) 
				{
					return "Unstable";
				}
			}
		}
		return "Stable";
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int r = s.nextInt();
			int c = s.nextInt();
			int a[][] = new int[r][c];
			for (int i = 0; i < r; i++) 
			{
				for (int j = 0; j < c; j++) 
				{
					a[i][j] = s.nextInt();
				}
			}
			System.out.println(solve(a, r, c));
		}
		s.close();
	}
}
