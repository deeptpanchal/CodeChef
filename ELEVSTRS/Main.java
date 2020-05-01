import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) 
		{
			int n = s.nextInt();
			int v1 = s.nextInt();
			int v2 = s.nextInt();
			System.out.println(v1 > (float) v2 / Math.sqrt(2) ? "Stairs" : "Elevator");
		}
		s.close();
	}
}
