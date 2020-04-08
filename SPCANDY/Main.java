import java.util.*;

public class Main 
{
	public static long s(long N, long K) 
	{
		if (K == 0)
			return 0;
		return N / K;
	}

	public static long t(long N, long K) 
	{
		if (K == 0)
			return N;
		return N % K;
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int i = 0; i < t; i++) 
		{
			long n = s.nextLong();
			long k = s.nextLong();
			System.out.println(s(n, k) + " " + t(n, k));
		}
		s.close();
	}
}
