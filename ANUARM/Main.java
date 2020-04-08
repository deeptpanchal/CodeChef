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
			int a[] = new int[m];
			for (int i = 0; i < m; i++) 
			{
				a[i] = s.nextInt();
			}
			int min = Arrays.stream(a).min().getAsInt();
			int max = Arrays.stream(a).max().getAsInt();
			for (int i = 0; i < n; i++) 
			{
				System.out.print(Math.max(Math.abs(min - i), Math.abs(max - i)) + " ");
			}
			System.out.println();
		}
		s.close();
	}
}
