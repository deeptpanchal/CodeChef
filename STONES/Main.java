import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			char[] X = s.next().toCharArray();
			char[] Y = s.next().toCharArray();
			int count = 0;
			for (int i = 0; i < Y.length; i++) 
			{
				for (int j = 0; j < X.length; j++) 
				{
					if (Y[i] == X[j]) 
					{
						count++;
						break;
					}
				}
			}
			System.out.println(count);
		}
		s.close();
	}
}
