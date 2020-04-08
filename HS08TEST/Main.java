import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		float b = s.nextFloat();

		if (a % 5 != 0 || a > b - 0.5) 
		{
			System.out.printf("%.2f", b);
		} 
		else 
		{
			System.out.printf("%.2f", b - a - 0.5);
		}
		s.close();
	}
}
