package FLOW017;

import java.util.*;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int a[] = new int[3];
			a[0] = s.nextInt();
			a[1] = s.nextInt();
			a[2] = s.nextInt();
			Arrays.sort(a);
			System.out.println(a[1]);
		}
		s.close();
	}
}