import java.util.*;

class point 
{
	int x, y;
	point(int x, int y) 
	{
		this.x = x;
		this.y = y;
	}
}

public class Main 
{
	static double solve(point p[]) 
	{
		Arrays.sort(p, (p1, p2) -> (p1.x != p2.x) ? Integer.compare(p1.x, p2.x) : Integer.compare(p2.y, p1.y));
		double sum = 0;
		for (int i = 0; i < p.length - 1; i++) 
		{
			sum += Math.sqrt(Math.pow(p[i + 1].x - p[i].x, 2) + Math.pow(p[i + 1].y - p[i].y, 2));
		}
		return sum;
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int O = s.nextInt();
		while (O-- > 0) 
		{
			int n = s.nextInt();
			point p[] = new point[n];
			for (int i = 0; i < n; i++) 
			{
				p[i] = new point(s.nextInt(), s.nextInt());
			}
			System.out.printf("%.2f\n", solve(p));
		}
		s.close();
	}
}
