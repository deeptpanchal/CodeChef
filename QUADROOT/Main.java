import java.util.*;

public class Main 
{
	static String solve(double a, double b, double c) 
	{
		double x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		double x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		return String.valueOf(x1 + "\n" + x2);
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		System.out.println(solve(a, b, c));
		s.close();
	}
}
