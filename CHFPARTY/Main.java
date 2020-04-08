import java.util.*;

public class Main 
{
	static int solve(int a[]) 
	{
		Arrays.sort(a);
		int x = 0;
		for (int i = 0; i < a.length; i++) 
		{
			if (x >= a[i]) 
			{
				x++;
			} 
			else 
			{
				break;
			}
		}
		return x;
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
			System.out.println(solve(a));
		}
		s.close();
	}
}
