import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) 
		{
			int n = s.nextInt();
			int count = 0;
			int index = -1;
			for (int i = 0; i < n; i++) 
			{
				int a = s.nextInt();
				if (a == 0) 
				{
					if (index == -1)
					{
						index = i;
					}
					count++;
				}
			}
			System.out.println(index != -1 ? (n - index + 10 * count) * 100 : 0);
		}
		s.close();
	}
}
