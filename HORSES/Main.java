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
			int a[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				a[i] = s.nextInt();
			}
			Arrays.sort(a);
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < n - 1; i++) 
			{
				if (min > Math.abs(a[i] - a[i + 1])) 
				{
					min = Math.abs(a[i] - a[i + 1]);
				}
			}
			System.out.println(min);
		}
		s.close();
	}
}
