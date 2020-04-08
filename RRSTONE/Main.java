import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		long a[] = new long[n];
		long max = Long.MIN_VALUE;
		long min = Long.MAX_VALUE;
		for (int i = 0; i < n; i++) 
		{
			a[i] = s.nextLong();
			max = Math.max(max, a[i]);
			min = Math.min(min, a[i]);
		}
		if (k == 0) 
		{
			for (int i = 0; i < n; i++) 
			{
				System.out.print(a[i] + " ");
			}
		} 
		else if (k % 2 == 1) 
		{
			for (int i = 0; i < n; i++) 
			{
				System.out.print(max - a[i] + " ");
			}
		} 
		else 
		{
			for (int i = 0; i < n; i++) 
			{
				System.out.print(a[i] - min + " ");
			}
		}
		s.close();
	}
}
