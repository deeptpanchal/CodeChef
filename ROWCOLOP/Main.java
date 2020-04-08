import java.util.*;

public class Main 
{
	static long max(long a[]) 
	{
		long max = Long.MIN_VALUE;
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i] > max) 
			{
				max = a[i];
			}
		}
		return max;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int q = s.nextInt();
		long row[] = new long[n];
		long col[] = new long[n];
		Arrays.fill(row, 0);
		Arrays.fill(col, 0);
		while (q-- > 0) 
		{
			String str = s.next();
			int x = s.nextInt();
			long y = s.nextLong();
			if (str.equals("RowAdd")) 
			{
				row[x - 1] += y;
			} 
			else 
			{
				col[x - 1] += y;
			}
		}
		System.out.println((long) (max(row) + max(col)));
		s.close();
	}
}
