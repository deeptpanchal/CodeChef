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
			boolean b[] = new boolean[n];
			Arrays.fill(b, false);
			for (int i = 0; i < n - 1; i++) 
			{
				if (a[i] != a[i + 1]) 
				{
					b[i] = true;
					b[i + 1] = true;
				}
			}
			int count = 0;
			for (int i = 0; i < n; i++) 
			{
				if (b[i]) 
				{
					count++;
				}
			}
			System.out.println(count);
		}
		s.close();
	}
}
