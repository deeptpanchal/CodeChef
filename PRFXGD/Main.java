import java.util.*;

public class Main 
{
	static int solve(String str, int n, int x) 
	{
		int count = 0;
		int a[] = new int[26];
		Arrays.fill(a, 0);
		for (int i = 0; i < str.length(); i++) 
		{
			if (a[str.charAt(i) - 'a'] < x) 
			{
				a[str.charAt(i) - 'a']++;
				count++;
			} 
			else 
			{
				if (n > 0) 
				{
					n--;
				} 
				else 
				{
					break;
				}
			}
		}
		return count;
	}

	public static void main(String arga[]) 
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) 
		{
			String str = s.next();
			int k = s.nextInt();
			int x = s.nextInt();
			System.out.println(solve(str, k, x));
		}
		s.close();
	}
}
