package LAPIN;

import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			String str = s.next();
			char ch1[] = str.substring(0, str.length() / 2).toCharArray();
			Arrays.sort(ch1);
			char ch2[] = str.substring(str.length() - str.length() / 2).toCharArray();
			Arrays.sort(ch2);
			String str1 = String.valueOf(ch1);
			String str2 = String.valueOf(ch2);
			if (str1.equals(str2)) 
			{
				System.out.println("YES");
			} 
			else 
			{
				System.out.println("NO");
			}
		}
		s.close();
	}
}