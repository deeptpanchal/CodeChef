import java.util.*;

public class Main 
{
	static boolean compare(int x[], int y[]) 
	{
		int count = 0;
		for (int i = 0; i < 3; i++) 
		{
			if (x[i] == y[i]) 
			{
				count++;
			}
			if (x[i] < y[i]) 
			{
				return false;
			}
		}
		return count != 3;
	}

	static String solve(int a[][])
	{
		for (int i = 0; i < 3; i++) 
		{
			for (int j = i + 1; j < 3; j++) 
			{
				if (!(compare(a[i], a[j]) || compare(a[j], a[i])))
				{
					return "no";
				}
			}
		}
		return "yes";
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int a[][] = new int[3][3];
			for (int i = 0; i < 3; i++) 
			{
				for (int j = 0; j < 3; j++)
				{
					a[i][j] = s.nextInt();
				}
			}
			System.out.println(solve(a));
		}
		s.close();
	}
}
