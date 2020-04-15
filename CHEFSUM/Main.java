import java.util.*;

public class Main 
{
	static int solve(int a[], int n) 
	{
		int index = 0;
		for (int i = 0; i < n; i++) 
		{
			if (a[i] < a[index]) 
			{
				index = i;
			}
		}
		return index + 1;
	}

	public static void main(String arga[]) 
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
			System.out.println(solve(a, n));
		}
		s.close();
	}
}
