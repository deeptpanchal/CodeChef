package FLOW006;

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
			int sum = 0;
			for (int i = n; i > 0; i = i / 10) 
			{
				sum = sum + i % 10;
			}
			System.out.println(sum);
		}
		s.close();
	}
}