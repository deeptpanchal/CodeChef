import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0)
		{
			int n = s.nextInt();
			int a = s.nextInt();
			int b = s.nextInt();
			int count_a = 0;
			int count_b = 0;
			for (int i = 0; i < n; i++) 
			{
				int temp = s.nextInt();
				if (temp == a) 
				{
					count_a++;
				}
				if (temp == b) 
				{
					count_b++;
				}
			}
			System.out.println((double) count_a * count_b / (n * n));
		}
		s.close();
	}
}
