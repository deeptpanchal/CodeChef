import java.util.*;

public class Main 
{
	static int nCr(int n, int r) 
	{
		int ans = 1;
		for (int i = 0; i < r; i++) 
		{
			ans = ans * (n - i) / (i + 1);
		}
		return ans;
	}

	static int solve(String str, int x) 
	{
		int sum = 0;
		for (int i = 0; i < 9; i++) 
		{
			int temp = 0;
			if (str.charAt(4 * i) == '0') 
			{
				temp++;
			}
			if (str.charAt(4 * i + 1) == '0') 
			{
				temp++;
			}
			if (str.charAt(4 * i + 2) == '0') 
			{
				temp++;
			}
			if (str.charAt(4 * i + 3) == '0') 
			{
				temp++;
			}
			if (str.charAt(52 - 2 * i) == '0') 
			{
				temp++;
			}
			if (str.charAt(53 - 2 * i) == '0') 
			{
				temp++;
			}
			if (temp >= x) 
			{
				sum = sum + nCr(temp, x);
			}
		}
		return sum;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int n = s.nextInt();
		int sum = 0;
		for (int i = 0; i < n; i++) 
		{
			String str = s.next();
			sum = sum + solve(str, x);
		}
		System.out.println(sum);
		s.close();
	}
}
