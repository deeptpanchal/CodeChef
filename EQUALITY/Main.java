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
			long a[] = new long[n];
			long sum = 0;
			for (int i = 0; i < n; i++) 
			{
				a[i] = s.nextLong();
				sum += a[i];
			}
			sum = sum / (n - 1);
			for (int i = 0; i < n; i++) 
			{
				System.out.print(sum - a[i] + " ");
			}
			System.out.println();
		}
		s.close();
	}
}
