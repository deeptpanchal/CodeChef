import java.util.*;

public class Main 
{
	static int solve(int n) 
	{
		int count = 0;
		for (int i = 2048; i > 0; i = i / 2) 
		{
			while (n - i >= 0) 
			{
				n = n - i;
				count++;
			}
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
