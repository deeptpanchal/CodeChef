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
			int k = s.nextInt();
			for (int i = n - k; i <= n; i++)
			{
				System.out.print(i + " ");
			}
			for (int i = 1; i < n - k; i++) 
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
		s.close();
	}
}
