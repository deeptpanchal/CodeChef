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
			for(int i = 0 ; i < n ; i++)
			{
				System.out.print(2*i+1+" ");
			}
			System.out.println();
		}
		s.close();
	}
}
