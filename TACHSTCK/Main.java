import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int d = s.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) 
		{
			a[i] = s.nextInt();
		}
		Arrays.sort(a);
		int count = 0;
		for (int i = 0; i < n - 1; i++) 
		{
			if (a[i + 1] - a[i] <= d) 
			{
				count++;
				i++;
			}
		}
		System.out.println(count);
		s.close();
	}
}
