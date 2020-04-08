import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int o = s.nextInt();
		while (o-- > 0) 
		{
			int x = s.nextInt();
			int y = s.nextInt();
			int k = s.nextInt();
			int n = s.nextInt();
			String ans = "UnluckyChef";
			for (int i = 0; i < n; i++) 
			{
				int p = s.nextInt();
				int c = s.nextInt();
				if (x - y <= p && c <= k) 
				{
					ans = "LuckyChef";
				}
			}
			System.out.println(ans);
		}
		s.close();
	}
}
