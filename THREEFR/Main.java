import java.util.*;

public class Main 
{
	static String solve(int a[]) 
	{
		Arrays.sort(a);
		return a[0] + a[1] == a[2] ? "yes" : "no";
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int a[] = new int[3];
			for (int i = 0; i < 3; i++) 
			{
				a[i] = s.nextInt();
			}
			System.out.println(solve(a));
		}
		s.close();
	}
}
