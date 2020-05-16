import java.util.*;

public class Main 
{
	static int gcd(int a, int b) 
	{
		return b == 0 ? a : gcd(b, a % b);
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			int gcd = 0;
			for (int i = 0; i < n; i++) 
			{
				gcd = gcd(gcd, s.nextInt());
			}
			System.out.println(gcd == 1 ? 0 : -1);
		}
		s.close();
	}
}
