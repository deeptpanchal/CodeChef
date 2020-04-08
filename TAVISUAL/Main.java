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
			int c = s.nextInt();
			int q = s.nextInt();
			for (int i = 0; i < q; i++) 
			{
				int l = s.nextInt();
				int r = s.nextInt();
				if (l <= c && c <= r) 
				{
					c = l + r - c;
				}
			}
			System.out.println(c);
		}
		s.close();
	}
}
