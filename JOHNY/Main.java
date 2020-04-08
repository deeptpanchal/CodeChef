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
			int m = s.nextInt();
			int temp = a[m - 1];
			Arrays.sort(a);
			System.out.println(Arrays.binarySearch(a, temp) + 1);
		}
		s.close();
	}
}
