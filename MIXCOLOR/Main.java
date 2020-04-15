import java.util.*;

public class Main 
{
	static int solve(int a[], int n) 
	{
		int ans = 0;
		Map<Integer, Integer> count = new HashMap<>();
		for (int i = 0; i < n; i++) 
		{
			count.put(a[i], count.getOrDefault(a[i], 0) + 1);
		}
		for (Map.Entry<Integer, Integer> temp : count.entrySet()) 
		{
			ans += temp.getValue() - 1;
		}
		return ans;
	}

	public static void main(String args[]) 
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
			System.out.println(solve(a, n));
		}
		s.close();
	}
}
