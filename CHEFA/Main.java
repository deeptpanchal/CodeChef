import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int O = s.nextInt();
		while (O-- > 0) 
		{
			int n = s.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				a[i] = s.nextInt();
			}
			Arrays.sort(a);
			long ans = 0;
			for (int i = n - 1; i >= 0; i -= 2) 
			{
				ans += (long) a[i];
			}
			System.out.println(ans);
		}
		s.close();
	}
}
