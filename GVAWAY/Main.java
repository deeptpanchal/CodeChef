import java.util.*;

public class Main 
{
	static int solve(int l, int r, int k) 
	{
		return l == r ? 1 : k;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) 
		{
			int l = s.nextInt();
			int r = s.nextInt();
			int k = s.nextInt();
			System.out.println(solve(l, r, k));
		}
		s.close();
	}
}
