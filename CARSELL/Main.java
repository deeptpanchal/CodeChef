import java.util.*;

public class Main 
{
	static int solve(ArrayList<Integer> a, int n) 
	{
		int sum = 0;
		Collections.sort(a, Collections.reverseOrder());
		for (int i = 0; i < n; i++) 
		{
			sum = sum + Math.max(a.get(i) - i, 0);
			sum = sum % 1000000007;
		}
		return sum;
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
