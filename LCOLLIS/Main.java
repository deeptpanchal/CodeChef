import java.util.*;

public class Main 
{
	static int solve(char ch[][], int n, int m) 
	{
		int sum = 0;
		for (int i = 0; i < m; i++) 
		{
			int count = 0;
			for (int j = 0; j < n; j++) 
			{
				if (ch[j][i] == '1') 
				{
					count++;
				}
			}
			sum = sum + count * (count - 1) / 2;
		}
		return sum;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) 
		{
			int n = s.nextInt();
			int m = s.nextInt();
			char ch[][] = new char[n][m];
			for (int i = 0; i < n; i++)
			{
				ch[i] = s.next().toCharArray();
			}
			System.out.println(solve(ch, n, m));
		}
		s.close();
	}
}
