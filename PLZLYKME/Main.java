import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int L = s.nextInt();
			int D = s.nextInt();
			int S = s.nextInt();
			int C = s.nextInt();
			double like = S * Math.pow(C + 1, D - 1);
			if (like >= L) 
			{
				System.out.println("ALIVE AND KICKING");
			} 
			else 
			{
				System.out.println("DEAD AND ROTTING");
			}
		}
		s.close();
	}
}
