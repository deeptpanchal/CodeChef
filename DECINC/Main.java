import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if (n % 4 == 0) 
		{
			System.out.println(++n);
		} 
		else 
		{
			System.out.println(--n);
		}
		s.close();
	}
}
