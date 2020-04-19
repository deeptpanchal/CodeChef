import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			int k = s.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				a[i] = s.nextInt();
			}
			for (int i = 0; i < n; i++) 
			{
				if (a[i] <= k) 
				{
					k = k - a[i];
					System.out.print("1");
				} 
				else 
				{
					System.out.print("0");
				}
			}
			System.out.println();
		}
		s.close();
	}
}
