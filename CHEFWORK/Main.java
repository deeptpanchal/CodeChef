import java.util.*;

public class Main
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int c[] = new int[n];
		int t[] = new int[n];
		for (int i = 0; i < n; i++)
		{
			c[i] = s.nextInt();
		}
		int t1 = 100000;
		int t2 = 100000;
		int t3 = 100000;
		for (int i = 0; i < n; i++) 
		{
			t[i] = s.nextInt();
			if (t[i] == 1) 
			{
				t1 = Math.min(t1, c[i]);
			}
			else if (t[i] == 2)
			{
				t2 = Math.min(t2, c[i]);
			} 
			else 
			{
				t3 = Math.min(t3, c[i]);
			}
		}
		System.out.println(Math.min(t1 + t2, t3));
		s.close();
	}
}
