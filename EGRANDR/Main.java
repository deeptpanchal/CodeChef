import java.util.*;

public class Main 
{
	static String solve(int a[], int n)
	{
		boolean flag = false;
		int sum = 0;
		for (int i = 0; i < n; i++) 
		{
			if (a[i] == 2) 
			{
				return "No";
			}
			if (a[i] == 5) 
			{
				flag = true;
			}
			sum = sum + a[i] - 4;
		}
		return (flag && sum >= 0) ? "Yes" : "No";
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		s.nextLine();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				a[i] = s.nextInt();
			}
			System.out.println(solve(a, n));
		}
		s.close();
	}
}
