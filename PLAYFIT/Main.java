import java.util.*;

public class Main 
{
	static int solve(int a[]) 
	{
		int ans = 0;
		int min = a[0];
		for (int i = 0; i < a.length; i++) 
		{
			min = Math.min(min, a[i]);
			ans = Math.max(ans, a[i] - min);
		}
		return ans;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int O = s.nextInt();
		while (O-- > 0) 
		{
			int n = s.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				a[i] = s.nextInt();
			}
			int temp = solve(a);
			System.out.println(temp == 0 ? "UNFIT" : temp);
		}
		s.close();
	}
}
