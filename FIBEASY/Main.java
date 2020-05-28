import java.util.*;

public class Main 
{
	static int fibb[] = new int[60];

	static void fibb()
	{
		fibb[0] = 0;
		fibb[1] = 1;
		for (int i = 2; i < 60; i++)
		{
			fibb[i] = (fibb[i - 1] + fibb[i - 2]) % 10;
		}
	}

	static int solve(long n) 
	{
		long p = 1;
		while (p * 2 <= n) 
		{
			p = p * 2;
		}
		return (int) (p % 60);
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		fibb();
		int x = s.nextInt();
		while (x-- > 0) 
		{
			long n = s.nextLong();
			System.out.println(fibb[solve(n) - 1]);
		}
		s.close();
	}
}
