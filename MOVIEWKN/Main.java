import java.util.*;

public class Main 
{
	static int solve(int l[], int r[], int n) 
	{
		int index = 0;
		for (int i = 1; i < n; i++) 
		{
			if (l[i] * r[i] > l[index] * r[index] || (l[i] * r[i] == l[index] * r[index] && r[i] > r[index])) 
			{
				index = i;
			}
		}
		return index + 1;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			int l[] = new int[n];
			int r[] = new int[n];
			for (int i = 0; i < n; i++)
			{
				l[i] = s.nextInt();
			}
			for (int i = 0; i < n; i++) 
			{
				r[i] = s.nextInt();
			}
			System.out.println(solve(l, r, n));
		}
		s.close();
	}
}
