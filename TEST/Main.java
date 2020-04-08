import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int temp = s.nextInt();
		while (temp != 42) 
		{
			System.out.println(temp);
			temp = s.nextInt();
		}
		s.close();
	}
}
