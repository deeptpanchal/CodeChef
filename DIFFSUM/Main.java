package DIFFSUM;

import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		if (n > m) 
		{
			System.out.println(n - m);
		} 
		else 
		{
			System.out.println(n + m);
		}
		s.close();
	}
}