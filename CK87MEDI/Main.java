import java.util.*;

public class Main 
{
	static int solve(int a[], int n, int k) 
	{
		Arrays.sort(a);
		int temp = (n + k) / 2;
		return temp < n ? a[temp] : 9;
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			int k = s.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
			{
				a[i] = s.nextInt();
			}
			System.out.println(solve(a, n, k));
		}
		s.close();
	}
}
