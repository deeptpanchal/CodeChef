import java.util.*;

public class Main 
{
	static long solve(long l, long r, long g) 
	{
		long min = l / g + ((l % g == 0) ? 0 : 1);
		long max = r / g;
		if (min < max || (min == 1 && max == 1)) 
		{
			return max - min + 1;
		}
		return 0;
	}

	public static void main(String arga[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			long l = s.nextLong();
			long r = s.nextLong();
			long g = s.nextLong();
			System.out.println(solve(l, r, g));
		}
		s.close();
	}
}
