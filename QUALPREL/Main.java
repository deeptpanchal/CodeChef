import java.util.*;

public class Main 
{
	static int solve(ArrayList<Integer> a, int k, int n) 
	{
		Collections.sort(a);
		return n - a.indexOf(a.get(n - k));
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			int k = s.nextInt();
			ArrayList<Integer> a = new ArrayList<>();
			for (int i = 0; i < n; i++) 
			{
				a.add(s.nextInt());
			}
			System.out.println(solve(a, k, n));
		}
		s.close();
	}
}
