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
			int odd = 0;
			for (int i = 0; i < n; i++) 
			{
				if (s.nextInt() % 2 == 1) 
				{
					odd = odd == 0 ? 1 : 0;
				}
			}
			System.out.println(odd == 0 || n == 1 ? 1 : 2);
		}
		s.close();
	}
}
