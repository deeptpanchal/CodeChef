import java.util.*;

public class Main 
{
	static int solve(int a[], int k) 
	{
		int sum = Arrays.stream(a).sum();
		return (int) Arrays.stream(a).filter(x -> x + k > sum - x).count();
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int O = s.nextInt();
		while (O-- > 0) 
		{
			int n = s.nextInt();
			int k = s.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				a[i] = s.nextInt();
			}
			System.out.println(solve(a, k));
		}
		s.close();
	}
}
