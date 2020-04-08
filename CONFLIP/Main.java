import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) 
		{
			int g = s.nextInt();
			while (g-- > 0) 
			{
				int i = s.nextInt();
				int n = s.nextInt();
				int q = s.nextInt();
				if (n % 2 == 0 || i == q) 
				{
					System.out.println(n / 2);
				} 
				else 
				{
					System.out.println(n / 2 + 1);
				}
			}
		}
		s.close();
	}
}
