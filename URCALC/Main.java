import java.util.*;

public class Main 
{	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		char c = s.next().toCharArray()[0];
		if (c == '+') 
		{
			System.out.println(a + b);
		} 
		else if (c == '-') 
		{
			System.out.println(a - b);
		} 
		else if (c == '*') 
		{
			System.out.println(a * b);
		} 
		else 
		{
			System.out.println((double) a / b);
		}
		s.close();
	}
}
