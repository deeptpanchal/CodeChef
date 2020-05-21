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
			for (int i = 0; i < n; i++) 
			{
				if (s.nextInt() % m == 0) 
				{
					count++;
				}
			}
			System.out.println((int)Math.pow(2, count) - 1);
		}
		s.close();
	}
}
