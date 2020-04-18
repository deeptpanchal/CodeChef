import java.util.*;

public class Main 
{
	static String solve(int a[]) 
	{
		Arrays.sort(a);
		if (a[0] == a[1] && a[2] == a[3]) 
		{
			return "YES";
		}
		return "NO";
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int a[] = new int[4];
			for (int i = 0; i < 4; i++)
			{
				a[i] = s.nextInt();
			}
			System.out.println(solve(a));
		}
		s.close();
	}
}
