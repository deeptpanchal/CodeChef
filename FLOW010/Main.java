import java.util.*;

public class Main 
{
	public static String ans(char ch) 
	{
		if (ch == 'B' || ch == 'b') 
		{
			return "BattleShip";
		}
		if (ch == 'C' || ch == 'c') 
		{
			return "Cruiser";
		}
		if (ch == 'D' || ch == 'd') 
		{
			return "Destroyer";
		}
		if (ch == 'F' || ch == 'f') 
		{
			return "Frigate";
		}
		return "";
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			System.out.println(ans(s.next().charAt(0)));
		}
		s.close();
	}
}
