import java.util.*;

public class Main 
{
	static String solve(int a[][]) 
	{
		for (int i = 0; i < 3; i++)
		{
			for (int j = i + 1; j < 3; j++)
			{
				if (a[i][0] == a[j][0] && a[i][1] != a[j][1]) 
				{
					return "NOT FAIR";
				} 
				else if (a[i][0] < a[j][0] && a[i][1] >= a[j][1]) 
				{
					return "NOT FAIR";
				}
				else if (a[i][0] > a[j][0] && a[i][1] <= a[j][1]) 
				{
					return "NOT FAIR";
				}
			}
		}
		return "FAIR";
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int a[][] = new int[3][2];
			for (int i = 0; i < 6; i++) 
			{
				a[i % 3][i / 3] = s.nextInt();
			}
			System.out.println(solve(a));
		}
		s.close();
	}
}
