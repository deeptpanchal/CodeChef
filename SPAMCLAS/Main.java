import java.util.*;

public class Main 
{
	static String solve(boolean start, boolean add, int total) 
	{
		if (start && add)
		{
			return total + " " + 0;
		} 
		else if (start && !add) 
		{
			return (total + 1) / 2 + " " + total / 2;
		} 
		else if (!start && add) 
		{
			return 0 + " " + total;
		} 
		else 
		{
			return total / 2 + " " + (total + 1) / 2;
		}
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0)
		{
			int n = s.nextInt();
			int minX = s.nextInt();
			int maxX = s.nextInt();
			boolean start = minX % 2 == 0;
			boolean add = false;
			for (int i = 0; i < n; i++) 
			{
				boolean w = s.nextInt() % 2 == 0;
				boolean b = s.nextInt() % 2 == 0;
				start = (!start & !w) ^ b;
				add = add | w;
			}
			System.out.println(solve(start, add, maxX - minX + 1));
		}
		s.close();
	}
}
