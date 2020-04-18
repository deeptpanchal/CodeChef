import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int l = s.nextInt();
		int b = s.nextInt();
		int Area = l * b;
		int Peri = 2 * (l + b);
		if (Area > Peri) 
		{
			System.out.println("Area");
		} 
		else if (Area < Peri) 
		{
			System.out.println("Peri");
		} 
		else 
		{
			System.out.println("Eq");
		}
		System.out.println(Math.max(Area, Peri));
		s.close();
	}
}
