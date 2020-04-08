import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) 
		{
			int n = s.nextInt();
			int k = s.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				a[i] = s.nextInt();
			}
			for (int i = 0; i < n; i++) 
			{
				b[i] = s.nextInt();
			}
			double max_ratio = (double) (b[0] / a[0]);
			int max_i = 0;
			for (int i = 0; i < n; i++) 
			{
				double temp = (double) (b[i] / a[i]);
				if (temp > max_ratio) 
				{
					max_ratio = temp;
					max_i = i;
				}
			}
			System.out.println((long) ((long) (k / a[max_i]) * b[max_i]));
		}
		s.close();
	}
}
