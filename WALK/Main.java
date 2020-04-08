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
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < n; i++) 
			{
				a[i] = i + s.nextInt();
				max = Math.max(max, a[i]);
			}
			System.out.println(max);
		}
		s.close();
	}
}
