import java.util.*;

public class Main 
{
	static double solve(ArrayList<Integer> a, int n) 
	{
		Collections.sort(a);
		int x = Collections.frequency(a, a.get(n - 1));
		if (x == 1) 
		{
			int y = Collections.frequency(a, a.get(n - 2));
			return (double) 2 * y / (n * (n - 1));
		}
		return (double) (x * (x - 1)) / (n * (n - 1));
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			ArrayList<Integer> a = new ArrayList<>();
			for (int i = 0; i < n; i++) 
			{
				a.add(s.nextInt());
			}
			System.out.println(solve(a, n));
		}
		s.close();
	}
}
