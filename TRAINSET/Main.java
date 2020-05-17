import java.util.*;

public class Main 
{
	static int solve(HashMap<String, int[]> h, int n) 
	{
		int ans = 0;
		for (String w : h.keySet()) 
		{
			int a[] = h.get(w);
			ans = ans + Math.max(a[0], a[1]);
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
			HashMap<String, int[]> h = new HashMap<>();
			for (int i = 0; i < n; i++) 
			{
				String w = s.next();
				int t = s.nextInt();
				int a[] = h.getOrDefault(w, new int[] { 0, 0 });
				a[t]++;
				h.put(w, a);
			}
			System.out.println(solve(h, n));
		}
		s.close();
	}
}
