import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			int quantity = s.nextInt();
			int price = s.nextInt();
			double total = quantity * price;
			if (quantity > 1000) 
			{
				total = total * 0.9;
			}
			System.out.printf("%6f\n", total);
		}
		s.close();
	}
}
