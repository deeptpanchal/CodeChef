import java.util.*;

public class Main
{
	static String days[] = { "mon", "tues", "wed", "thurs", "fri", "sat", "sun" };

	static String solve(int W, String S) 
	{
		int count[] = new int[7];
		int x = Arrays.asList(days).indexOf(S);
		for (int i = 0; i < W; i++) 
		{
			count[(i + x) % 7]++;
		}
		return Arrays.toString(count).substring(1, 20).replaceAll(",", "");
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0)
		{
			int W = s.nextInt();
			String S = s.next();
			System.out.println(solve(W, S));
		}
		s.close();
	}
}
