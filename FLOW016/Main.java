import java.util.*;

public class Main 
{
	static int gcd(int a, int b) 
	{
		if (b == 0) 
		{
			return a;
		}
		return gcd(b, a % b);
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int a = s.nextInt();
			int b = s.nextInt();
			int gcd = gcd(a, b);
			System.out.println(gcd + " " + (long) a / gcd * b);
		}
		s.close();
	}
}
