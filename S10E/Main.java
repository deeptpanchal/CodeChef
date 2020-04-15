import java.util.*;

public class Main 
{
	static int solve(int p[], int n) 
	{
		int count = 0;
		for (int i = 0; i < n; i++) 
		{
			int flag = 1;
			for (int j = Math.max(0, i - 5); j < i; j++) 
			{
				if (p[i] >= p[j]) 
				{
					flag = 0;
					break;
				}
			}
			if (flag == 1) 
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String arga[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			int p[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				p[i] = s.nextInt();
			}
			System.out.println(solve(p, n));
		}
		s.close();
	}
}
