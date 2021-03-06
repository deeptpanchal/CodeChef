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
			int a[] = new int[n];
			long min = Long.MAX_VALUE;
			for (int i = 0; i < n; i++) 
			{
				a[i] = s.nextInt();
				min = Math.min(min, a[i]);
			}
			System.out.println(min * (n - 1));
		}
		s.close();
	}
}
