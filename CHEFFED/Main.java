import java.util.*;

public class Main 
{
	static int sum(int n) 
	{
		int sum = 0;
		for (int i = n; i > 0; i = i / 10) 
		{
			sum = sum + i % 10;
		}
		return sum;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int count = 0;
		for (int i = n - 90; i <= n; i++) 
		{
			if (n == i + sum(i) + sum(sum(i))) 
			{
				count++;
			}
		}
		System.out.println(count);
		s.close();
	}
}
