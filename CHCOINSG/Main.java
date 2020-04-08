import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int O = s.nextInt();
		while (O-- > 0) 
		{
			System.out.println(s.nextInt() % 6 == 0 ? "Misha" : "Chef");
		}
		s.close();
	}
}
