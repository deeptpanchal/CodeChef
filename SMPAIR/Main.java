import java.util.*;

public class Main 
{
	public static void main(String[] args) 
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
			Arrays.sort(a);
			System.out.println(a[0] + a[1]);
		}
		s.close();
	}
}
