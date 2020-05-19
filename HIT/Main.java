import java.util.*;

public class Main
{
	static String solve(int a[], int n) 
	{
		Arrays.sort(a);
		int index = n / 4;
		int x = a[index];
		int y = a[2 * index];
		int z = a[3 * index];
		if (a[index - 1] < x && a[2 * index - 1] < y && a[3 * index - 1] < z) 
		{
			return x + " " + y + " " + z;
		}
		return "-1";
	}

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
			System.out.println(solve(a, n));
		}
		s.close();
	}
}
