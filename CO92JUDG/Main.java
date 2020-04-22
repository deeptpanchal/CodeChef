import java.util.*;

public class Main 
{
	static String solve(int a[], int b[], int n) 
	{
		int sum = 0;
		Arrays.sort(a);
		Arrays.sort(b);
		for (int i = 0; i < n - 1; i++) 
		{
			sum = sum + a[i] - b[i];
		}
		return sum == 0 ? "Draw" : sum < 0 ? "Alice" : "Bob";
	}

	public static void main(String[] args) 
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
			int b[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				b[i] = s.nextInt();
			}
			System.out.println(solve(a, b, n));
		}
		s.close();
	}
}
