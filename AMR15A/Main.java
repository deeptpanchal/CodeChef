package AMR15A;

import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int count = 0;
		while (x-- > 0) 
		{
			if (s.nextInt() % 2 == 0) 
			{
				count++;
			} 
			else {
				
				count--;
			}
		}
		if (count > 0) 
		{
			System.out.println("READY FOR BATTLE");
		} 
		else 
		{
			System.out.println("NOT READY");
		}
		s.close();
	}
}