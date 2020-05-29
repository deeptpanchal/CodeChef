import java.util.*;

public class Main 
{
	static int solve(int r, int c, int k)
	{
		int i = Math.min(8, r + k) + 1 - Math.max(1, r - k);
		int j = Math.min(8, c + k) + 1 - Math.max(1, c - k);
		return i * j;
	}

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0)
		{
			int r = s.nextInt();
			int c = s.nextInt();
			int k = s.nextInt();
			System.out.println(solve(r, c, k));
		}
		s.close();
	}
}
