import java.util.*;

public class Main 
{
	static String solve(long marks[], int n, int k, int e, int m) 
	{
		long mark = marks[n - 1];
		Arrays.sort(marks);
		long diff = marks[n - k] - mark + 1;
		return diff <= m ? String.valueOf(Math.max(0, diff)) : "Impossible";
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			int k = s.nextInt();
			int e = s.nextInt();
			int m = s.nextInt();
			long marks[] = new long[n];
			for (int i = 0; i < n; i++) 
			{
				int range = i == n - 1 ? e - 1 : e;
				for (int j = 0; j < range; j++) 
				{
					marks[i] = marks[i] + s.nextInt();
				}
			}
			System.out.println(solve(marks, n, k, e, m));
		}
		s.close();
	}
}
