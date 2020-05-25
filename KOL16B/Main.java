import java.util.*;

public class Main 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		for (int t = 1; t <= x; t++)
		{
			int n = s.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			for (int i = 0; i < n; i++)
			{
				int A = s.nextInt();
				b[i] = A >> 16;
				a[i] = A & 65535;
			}
			System.out.println("Case " + t + ":");
			for (int i = 0; i < n; i++) 
			{
				System.out.print(a[i] + " ");
			}
			System.out.println();
			for (int i = 0; i < n; i++)
			{
				System.out.print(b[i] + " ");
			}
			System.out.println();
		}
		s.close();
	}
}
