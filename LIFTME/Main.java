import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int n = s.nextInt();
			int q = s.nextInt();
			long sum = 0;
			int temp = 0;
			for (int i = 0; i < q; i++)
			{
				int f = s.nextInt();
				int d = s.nextInt();
				sum = sum + Math.abs(temp - f) + Math.abs(f - d);
				temp = d;
			}
			System.out.println(sum);
		}
		s.close();
	}
}
