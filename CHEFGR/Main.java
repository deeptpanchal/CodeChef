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
			int m = s.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				a[i] = s.nextInt();
			}
			Arrays.sort(a);
			int sum = 0;
			for (int i = 0; i < n; i++) 
			{
				sum += a[n - 1] - a[i];
			}
			if (m >= sum && (m - sum) % n == 0) 
			{
				System.out.println("Yes");
			} 
			else 
			{
				System.out.println("No");
			}
		}
		s.close();
	}
}
