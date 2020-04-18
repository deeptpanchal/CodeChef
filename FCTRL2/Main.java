import java.math.*;
import java.util.*;

public class Main 
{
	static BigInteger solve(int n) 
	{
		BigInteger ans = BigInteger.ONE;
		for (int i = 1; i <= n; i++) 
		{
			ans = ans.multiply(BigInteger.valueOf(i));
		}
		return ans;
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			System.out.println(solve(n));
		}
		s.close();
	}
}
