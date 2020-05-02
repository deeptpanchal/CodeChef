import java.util.*;

public class Main 
{
	static int solve(String str, int a[]) 
	{
		int sum = 0;
		for (int i = 0; i < 26; i++) 
		{
			if (str.indexOf('a' + i) == -1) 
			{
				sum = sum + a[i];
			}
		}
		return sum;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int a[] = new int[26];
			for (int i = 0; i < 26; i++) 
			{
				a[i] = s.nextInt();
			}
			String str = s.next();
			System.out.println(solve(str, a));
		}
		s.close();
	}
}
