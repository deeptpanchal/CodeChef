package FRUITS;

import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			int m = s.nextInt();
			int k = s.nextInt();
			int ans = Math.abs(n - m);
			if (k >= ans) 
			{
				ans = 0;
			} 
			else 
			{
				ans = ans - k;
			}
			System.out.println(ans);
		}
		s.close();
	}
}