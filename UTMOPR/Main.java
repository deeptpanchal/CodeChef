import java.util.*;

public class Main
{
	static String solve(int a[], int n) 
	{
		long sum = 1;
		for (int i = 0; i < n; i++) 
		{
			sum = sum + a[i];
		}
		return sum % 2 == 0 ? "even" : "odd";
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) 
		{
			int n = s.nextInt();
			int k = s.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				a[i] = s.nextInt();
			}
			System.out.println(k == 1 ? solve(a, n) : "even");
		}
		s.close();
	}
}
