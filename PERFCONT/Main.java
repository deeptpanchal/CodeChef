import java.util.*;

public class Main 
{
	static String solve(int a[], int n, int p) 
	{
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < n; i++) 
		{
			if (a[i] >= p / 2) 
			{
				count1++;
			}
			if (a[i] <= p / 10) 
			{
				count2++;
			}
		}
		return count1 == 1 && count2 == 2 ? "yes" : "no";
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			int p = s.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				a[i] = s.nextInt();
			}
			System.out.println(solve(a, n, p));
		}
		s.close();
	}
}
