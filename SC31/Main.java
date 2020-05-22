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
			int ans = Integer.parseInt(s.next(), 2);
			for (int i = 1; i < n; i++) 
			{
				ans = ans ^ Integer.parseInt(s.next(), 2);
			}
			System.out.println(Integer.bitCount(ans));
		}
		s.close();
	}
}
