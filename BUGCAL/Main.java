import java.util.*;

public class Main 
{
	static int solve(int a, int b) 
	{
		int sum = 0;
		int count = 0;
		for (int i = Math.max(a, b), j = Math.min(a, b); i > 0; i = i / 10, j = j / 10) 
		{
			sum = sum + ((i % 10 + j % 10) % 10) * (int) Math.pow(10, count++);
		}
		return sum;
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int a = s.nextInt();
			int b = s.nextInt();
			System.out.println(solve(a, b));
		}
		s.close();
	}
}
