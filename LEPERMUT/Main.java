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
			int a[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				a[i] = s.nextInt();
			}
			int count = 0;
			for (int i = 0; i < n - 1; i++) 
			{
				for (int j = i + 1; j < n; j++) 
				{
					if (a[i] > a[j]) 
					{
						count++;
					}
				}
			}
			for (int i = 0; i < n - 1; i++) 
			{
				if (a[i] > a[i + 1]) 
				{
					count--;
				}
			}
			if (count == 0) 
			{
				System.out.println("YES");
			} 
			else 
			{
				System.out.println("NO");
			}
		}
		s.close();
	}
}
