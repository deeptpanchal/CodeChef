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
			int ans = 0;
			for (int i = 0; i < n; i++) 
			{
				ans = ans + a[i] - a[0];
			}
			System.out.println(ans);
		}
		s.close();
	}
}
