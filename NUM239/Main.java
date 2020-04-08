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
			int m = s.nextInt();
			int count = 0;
			for (int i = n; i <= m; i++) 
			{
				if (i % 10 == 2 || i % 10 == 3 || i % 10 == 9) 
				{
					count++;
				}
			}
			System.out.println(count);
		}
		s.close();
	}
}
