import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int ans = a - b;
		if (ans % 10 == 9) 
		{
			System.out.println(ans - 1);
		} 
		else 
		{
			System.out.println(ans + 1);
		}
		s.close();
	}
}
