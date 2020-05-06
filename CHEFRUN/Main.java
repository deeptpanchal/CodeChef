import java.util.*;

public class Main 
{
	static String solve(int x1, int x2, int x3, int v1, int v2) 
	{
		long temp = (long) (x3 - x1) * v2 - (long) (x2 - x3) * v1;
		return temp < 0 ? "Chef" : temp > 0 ? "Kefa" : "Draw";
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int x1 = s.nextInt();
			int x2 = s.nextInt();
			int x3 = s.nextInt();
			int v1 = s.nextInt();
			int v2 = s.nextInt();
			System.out.println(solve(x1, x2, x3, v1, v2));
		}
		s.close();
	}
}
