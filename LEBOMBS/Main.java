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
			String str = s.next();
			char a[] = str.toCharArray();
			int count = 0;
			if (n != 1) 
			{
				if (a[0] == '1' && a[1] == '0') 
				{
					a[0] = '2';
					a[1] = '2';
				} 
				else if (a[0] == '1' && a[1] == '1') 
				{
					a[0] = '2';
				}
				for (int i = 1; i < n - 1; i++) 
				{
					if (a[i] == '1' && a[i + 1] == '0') 
					{
						a[i - 1] = '2';
						a[i] = '2';
						a[i + 1] = '2';
					} 
					else if (a[i] == '1' && a[i + 1] == '1') 
					{
						a[i - 1] = '2';
						a[i] = '2';
					}
				}
				if (a[n - 1] == '1') 
				{
					a[n - 1] = '2';
					a[n - 2] = '2';
				}
				for (int i = 0; i < n; i++) 
				{
					if (a[i] == '0') 
					{
						count++;
					}
				}
			} 
			else 
			{
				if (a[0] == '0') 
				{
					count = 1;
				}
			}
			System.out.println(count);
		}
		s.close();
	}
}
