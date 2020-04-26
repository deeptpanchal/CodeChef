import java.util.*;

public class Main 
{
	static int max = 1000001;
	static long fact[] = new long[max];

	static void solve() 
	{
		fact[0] = 1;
		for (int i = 1; i < max; i++) 
		{
			fact[i] = (fact[i - 1] * (i + 1)) % 1000000007;
		}
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		solve();
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			System.out.println(fact[n] - 1);
		}
		s.close();
	}
}
