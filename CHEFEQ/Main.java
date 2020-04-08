import java.util.*;

public class Main 
{
	static int solve(int a[]) 
	{
		Map<Integer, Integer> m = new HashMap<>();
		for (int temp : a) 
		{
			m.put(temp, m.getOrDefault(temp, 0) + 1);
		}
		return a.length - m.values().stream().mapToInt(x -> x).max().getAsInt();
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int O = s.nextInt();
		while (O-- > 0) 
		{
			int n = s.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				a[i] = s.nextInt();
			}
			System.out.println(solve(a));
		}
		s.close();
	}
}
