import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) 
		{
			a[i] = s.nextInt();
		}
		int ans = Integer.MIN_VALUE;
		int count = 0;
		for (int i = 0; i < n; i++) 
		{
			if (a[i] == 0) 
			{
				ans = Math.max(ans, count);
				count = 0;
			} 
			else 
			{
				count++;
			}
		}
		System.out.println(Math.max(ans, count));
		s.close();
	}
}
