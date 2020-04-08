import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		long m = s.nextLong();
		while (m-- > 0) 
		{
			long q = s.nextLong();
			if (q < n + 2) 
			{
				System.out.println("0");
			} 
			else 
			{
				if (q <= 2 * n + 1) 
				{
					System.out.print(q - n - 1);
				} 
				else 
				{
					System.out.print(3 * n - q + 1);
				}
			}
			System.out.println();
		}
		s.close();
	}
}
