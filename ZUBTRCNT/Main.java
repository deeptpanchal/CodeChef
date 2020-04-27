import java.util.*;

public class Main 
{
	static int solve(int l, int k) 
	{
		int temp = l - k + 1;
		return temp < 0 ? 0 : temp * (temp + 1) / 2;
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		for (int i = 0; i < x; i++) 
		{
			int l = s.nextInt();
			int k = s.nextInt();
			System.out.println("Case " + (i + 1) + ": " + solve(l, k));
		}
		s.close();
	}
}
