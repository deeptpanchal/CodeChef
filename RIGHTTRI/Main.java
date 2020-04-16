import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			double H = s.nextDouble();
			double S = s.nextDouble();
			double temp = 1 - (4 * S / (H * H)) * (4 * S / (H * H));
			if (temp < 0) 
			{
				System.out.println("-1");
			} 
			else 
			{
				temp = Math.sqrt(temp);
				System.out.println(H * Math.sqrt((1 - temp) / 2) + " " + H * Math.sqrt((1 + temp) / 2) + " " + H);
			}
		}
		s.close();
	}
}
