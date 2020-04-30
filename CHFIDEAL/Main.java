import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("1");
		System.out.println(s.nextInt() == 2 ? "3" : "2");
		s.close();
	}
}
