import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int O = s.nextInt();
		while (O-- > 0) 
		{
			int n = s.nextInt();
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			long ans = 0;
			for (int i = 0; i <= a; i++) 
			{
				for (int j = 0; j <= b; j++) 
				{
					ans = ans + Math.max(-1, Math.min(c, n - i - j)) + 1;
				}
			}
			System.out.println(ans);
		}
		s.close();
	}
}
