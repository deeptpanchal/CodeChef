import java.util.*;

public class Main 
{
	static String solve(int positive, int negative) 
	{
		if (positive == 0 || negative == 0)
		{
			return Math.max(positive, negative) + " " + Math.max(positive, negative);
		}
		return Math.max(positive, negative) + " " + Math.min(positive, negative);
	}

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			int positive = 0;
			for (int i = 0; i < n; i++)
			{
				if (s.nextInt() > 0)
				{
					positive++;
				}
			}
			System.out.println(solve(positive, n - positive));
		}
		s.close();
	}
}
