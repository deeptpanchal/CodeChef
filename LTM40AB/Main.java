import java.util.*;

public class Main 
{
	static long solve(int a, int b, int c, int d) 
	{
		long count = 0;
		for (int i = a; i <= b; i++)
		{
			if (i < c) 
			{
				count = count + (d - c + 1);
			} 
			else if (c <= i && i <= d) 
			{
				count = count + (d - i);
			}
		}
		return count;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			int d = s.nextInt();
			System.out.println(solve(a, b, c, d));
		}
		s.close();
	}
}
