import java.util.*;

public class Main 
{
	static int solve(char a[], char ch) 
	{
		int count = 0;
		for (int i = 0; i < a.length; i++) 
		{
			if ((i % 2 == 0 && a[i] == ch) || (i % 2 == 1 && a[i] != ch)) 
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int O = s.nextInt();
		while (O-- > 0) 
		{
			char a[] = s.next().toCharArray();
			System.out.println(Math.min(solve(a, '+'), solve(a, '-')));
		}
		s.close();
	}
}
