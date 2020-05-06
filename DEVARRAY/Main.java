import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int q = s.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) 
		{
			a[i] = s.nextInt();
		}
		Arrays.sort(a);
		for (int i = 0; i < q; i++) 
		{
			int t = s.nextInt();
			System.out.println(a[0] <= t && t <= a[n - 1] ? "Yes" : "No");
		}
		s.close();
	}
}
