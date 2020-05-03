import java.util.*;

public class Main
{
	static String solve(int x[], int y[], int k) 
	{
		int count = 0;
		for (int i = 0; i < 3; i++) 
		{
			for (int j = i + 1; j < 3; j++) 
			{
				if (Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2) <= Math.pow(k, 2)) 
				{
					count++;
				}
			}
		}

		return count >= 2 ? "yes" : "no";
	}

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) 
		{
			int k = s.nextInt();
			int x[] = new int[3];
			int y[] = new int[3];
			for (int i = 0; i < 3; i++) 
			{
				x[i] = s.nextInt();
				y[i] = s.nextInt();
			}
			System.out.println(solve(x, y, k));
		}
		s.close();
	}
}
