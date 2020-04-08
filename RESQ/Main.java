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
			int min = Integer.MAX_VALUE;
			for (int i = 1; i <= Math.sqrt(n); i++) 
			{
				if (n % i == 0) 
				{
					min = Math.min(min, Math.abs(i - n / i));
				}
			}
			System.out.println(min);
		}
		s.close();
	}
}
