import java.util.*;

public class Main 
{
	static boolean check(boolean bool, char ch) 
	{
		return (bool && ch == 'H') || (!bool && ch == 'T');
	}

	static int solve(char ch[], int n, int k) 
	{
		boolean bool = true;
		for (int i = n - 1; i >= n - k; i--) 
		{
			if (check(bool, ch[i])) 
			{
				bool = !bool;
			}
		}
		int count = 0;
		for (int i = 0; i < n - k; i++) 
		{
			if (check(bool, ch[i])) 
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			int k = s.nextInt();
			char ch[] = new char[n];
			for (int i = 0; i < n; i++) 
			{
				ch[i] = s.next().charAt(0);
			}
			System.out.println(solve(ch, n, k));
		}
		s.close();
	}
}
