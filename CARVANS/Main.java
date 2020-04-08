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
			int temp = a[0];
			int count = 0;
			for (int i = 1; i < n; i++) 
			{
				if (a[i] > temp) 
				{
					a[i] = temp;
					count++;
				} 
				else 
				{
					temp = a[i];
				}
			}
			System.out.println(n - count);
		}
		s.close();
	}
}
