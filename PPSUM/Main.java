package PPSUM;

import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int a = s.nextInt();
			int n = s.nextInt();
			for (int i = 0; i < a; i++) 
			{
				n = n * (n + 1) / 2;
			}
			System.out.println(n);
		}
		s.close();
	}
}