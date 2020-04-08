import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int n = s.nextInt();
		int k = s.nextInt();
		int temp = 1;
		for (int i = 0; i < k; i++) 
		{
			int ans = 0;
			if (a < temp) 
			{
				ans = 0;
			} 
			else 
			{
				ans = (a / temp) % (n + 1);
				temp = temp * (n + 1);
			}
			System.out.print(ans + " ");
		}
		s.close();
	}
}
