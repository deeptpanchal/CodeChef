import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = n * (n + 1) / 2;
		for (int i = 0; i < n; i++) 
		{
			sum -= s.nextInt();
		}
		if (sum == 0) 
		{
			System.out.println("YES");
		} 
		else 
		{
			System.out.println("NO");
		}
		s.close();
	}
}
