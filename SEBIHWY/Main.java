import java.util.*;

public class Main 
{
	static String solve(int S, int SG, int FG, int D, int T)
	{
		float v = S + 180f * D / T;
		return Math.abs(v - SG) == Math.abs(v - FG) ? "DRAW" : Math.abs(v - SG) < Math.abs(v - FG) ? "SEBI" : "FATHER";
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int S = s.nextInt();
			int SG = s.nextInt();
			int FG = s.nextInt();
			int D = s.nextInt();
			int T = s.nextInt();
			System.out.println(solve(S, SG, FG, D, T));
		}
		s.close();
	}
}
