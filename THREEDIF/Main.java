import java.math.*;
import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int O = s.nextInt();
		while (O-- > 0) 
		{
			BigInteger a[] = new BigInteger[3];
			BigInteger r = new BigInteger("1000000007");
			for (int i = 0; i < 3; i++) 
			{
				a[i] = s.nextBigInteger();
			}
			Arrays.sort(a);
			BigInteger ans = BigInteger.ONE;
			for (int i = 0; i < 3; i++) 
			{
				ans = ans.multiply(a[i].subtract(BigInteger.valueOf(i)));
			}
			System.out.println(ans.remainder(r));
		}
		s.close();
	}
}
