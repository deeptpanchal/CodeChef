import java.util.*;
import java.text.*;

public class Main 
{
	static double ans(int P, int S) 
	{
		DecimalFormat df = new DecimalFormat("0.00");
		double c = (P - Math.sqrt(P * P - 24 * S)) / 12;
		double ans = Double.parseDouble(df.format((4 * c * c * c - P * c * c + 2 * S * c) / 4));
		return ans;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int P = s.nextInt();
			int S = s.nextInt();
			System.out.printf("%.2f\n", ans(P, S));
		}
		s.close();
	}
}
