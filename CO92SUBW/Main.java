import java.util.*;

public class Main 
{
	static int get(int n) 
	{
		return n * (n + 1) / 2;
	}

	static long solve(int n) 
	{
		int temp1 = ((int) Math.sqrt(1 + 8 * (long) n) - 1) / 2;
		int temp2 = ((int) Math.sqrt(1 + 8 * (long) n) + 1) / 2;
		int temp = (Math.abs(get(temp1) - n) <= Math.abs(get(temp2) - n)) ? temp1 : temp2;
		return temp + Math.abs(get(temp) - n);
	}

	public static void main(String args[]) 
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
