import java.util.*;

public class Main 
{
	static String solve(int a[], int n) 
	{
		int count = 0;
		for (int i = 0; i < n; i++) 
		{
			count = a[i] == 1 ? ++count : --count;
			if (count < 0) 
			{
				return "Invalid";
			}
		}
		return "Valid";
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				a[i] = s.nextInt();
			}
			System.out.println(solve(a, n));
		}
		s.close();
	}
}
