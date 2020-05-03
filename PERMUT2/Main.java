import java.util.*;

public class Main 
{
	static String solve(int a[], int b[]) 
	{
		return Arrays.equals(a, b) ? "ambiguous" : "not ambiguous";
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		while (true) 
		{
			int n = s.nextInt();
			if (n == 0) 
			{
				break;
			}
			int a[] = new int[n];
			int b[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				a[i] = s.nextInt();
				b[a[i] - 1] = i + 1;
			}
			System.out.println(solve(a, b));
		}
		s.close();
	}
}
