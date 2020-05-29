import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			int max_profit = 0;
			while (n-- > 0) 
			{
				int S = s.nextInt();
				int P = s.nextInt();
				int V = s.nextInt();
				max_profit = Math.max(max_profit, (P / (S + 1)) * V);
			}
			System.out.println(max_profit);
		}
		s.close();
	}
}
