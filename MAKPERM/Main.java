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
			int b[] = new int[n];
			Arrays.fill(b, 0);
			for (int i = 0; i < n; i++) 
			{
				a[i] = s.nextInt();
				if (a[i] <= n) 
				{
					b[a[i] - 1] = 1;
				}
			}
			int count = 0;
			for (int i = 0; i < n; i++) 
			{
				if (b[i] == 0) 
				{
					count++;
				}
			}
			System.out.println(count);
		}
		s.close();
	}
}
