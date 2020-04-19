import java.util.*;

public class Main 
{
	static int solve(int sum) 
	{
		int temp[] = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
		int ans = 0;
		for (int i = sum; i > 0; i = i / 10) 
		{
			ans = ans + temp[i % 10];
		}
		return ans;
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		s.nextLine();
		while (x-- > 0) 
		{
			int a = s.nextInt();
			int b = s.nextInt();
			System.out.println(solve(a + b));
		}
		s.close();
	}
}
