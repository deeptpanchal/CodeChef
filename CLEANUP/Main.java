import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			int m = s.nextInt();
			int a[] = new int[n];
			Arrays.fill(a, 1);
			for (int i = 0; i < m; i++) 
			{
				a[s.nextInt() - 1] = 0;
			}
			int count = 0;
			for (int i = 0; i < n; i++) 
			{
				if (a[i] == 1 && count % 2 == 0) 
				{
					count++;
				} else if (a[i] == 1 && count % 2 == 1) 
				{
					a[i] = 2;
					count++;
				}
			}
			for (int i = 0; i < n; i++) 
			{
				if (a[i] == 1) 
				{
					System.out.print(i + 1 + " ");
				}
			}
			System.out.println();
			for (int i = 0; i < n; i++) 
			{
				if (a[i] == 2) 
				{
					System.out.print(i + 1 + " ");
				}
			}
			System.out.println();
		}
		s.close();
	}
}
