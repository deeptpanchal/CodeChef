import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int r = s.nextInt();
		System.out.println(r <= 50 ? 100 : r <= 100 ? 50 : 0);
		s.close();
	}
}
