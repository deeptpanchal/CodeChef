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
			int k = s.nextInt();
			int a[] = new int[n];
			int count = 0;
			for (int i = 0; i < n; i++) 
			{
				a[i] = s.nextInt();
				if ((a[i] + k) % 7 == 0) 
				{
					count++;
				}
			}
			System.out.println(count);
		}
		s.close();
	}
}
