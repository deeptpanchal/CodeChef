import java.util.*;

public class Main 
{
	static int solve(int n) 
	{
		int count = 0;
		for (int i = (int) Math.sqrt(n); n > 0; i = (int) Math.sqrt(n)) 
		{
			n = n - i * i;
			count++;
		}
		return count;
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			System.out.println(solve(n));
		}
		s.close();
	}
}
