import java.util.*;

public class Main 
{
	static int solve(int a[], int n) 
	{
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) 
		{
			hm.put(a[i], hm.getOrDefault(a[i], 0) + 1);
		}
		return n - Collections.max(hm.values());
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
