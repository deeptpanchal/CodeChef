import java.util.*;

public class Main 
{
	static boolean ans(int arr[], int n, int sum) 
	{
		if (sum == 0) 
		{
			return true;
		}
		if (n == 0 && sum != 0) 
		{
			return false;
		}
		if (arr[n - 1] > sum) 
		{
			return ans(arr, n - 1, sum);
		}
		return ans(arr, n - 1, sum) || ans(arr, n - 1, sum - arr[n - 1]);
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			int sum = s.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				a[i] = s.nextInt();
			}
			if (ans(a, n, sum)) 
			{
				System.out.println("Yes");
			} 
			else 
			{
				System.out.println("No");
			}
		}
		s.close();
	}
}
