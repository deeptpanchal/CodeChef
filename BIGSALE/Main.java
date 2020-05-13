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
			double sum = 0;
			for (int i = 0; i < n; i++) 
			{
				int price = s.nextInt();
				int quantity = s.nextInt();
				int discount = s.nextInt();
				sum = sum + (discount / 100.0) * (discount / 100.0) * price * quantity;
			}
			System.out.println(sum);
		}
		s.close();
	}
}
