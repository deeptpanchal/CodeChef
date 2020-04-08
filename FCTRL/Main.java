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
			int count = 0;
			int temp = 5;
			while (n / temp > 0) 
			{
				count = count + n / temp;
				temp = temp * 5;
			}
			System.out.println(count);
		}
		s.close();
	}
}
