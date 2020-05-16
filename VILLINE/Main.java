import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int c = s.nextInt();
		int power1 = 0;
		int power2 = 0;
		for (int i = 0; i < n; i++) 
		{
			int x = s.nextInt();
			int y = s.nextInt();
			int p = s.nextInt();
			if (y - m * x - c > 0) 
			{
				power1 = power1 + p;
			} 
			else
			{
				power2 = power2 + p;
			}
		}
		System.out.println(Math.max(power1, power2));
		s.close();
	}
}
