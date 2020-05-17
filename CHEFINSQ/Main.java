import java.util.*;

public class Main
{
	static long C(int n, int r) 
	{
		long ans = 1;
		for (int i = 0; i < r; i++) 
		{
			ans = ans * (n - i) / (i + 1);
		}

		return ans;
	}

	static long solve(ArrayList<Integer> a, int n, int k) 
	{
		Collections.sort(a);
		int start = a.indexOf(a.get(k-1));
		int end = a.lastIndexOf(a.get(k-1));
		return C(end - start + 1, k - start);
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
			System.out.println(solve(a, n, k));
		}
		s.close();
	}
}
