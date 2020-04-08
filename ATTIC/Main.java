import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int O = s.nextInt();
		while (O-- > 0) 
		{
			char a[] = s.next().toCharArray();
			int day = 0;
			int jump = 1;
			for (int i = 0; i < a.length; i++) 
			{
				if (a[i] == '.') 
				{
					int temp = 2;
					int j;
					for (j = i + 1; j < a.length; j++) 
					{
						if (a[j] == '.') 
						{
							temp++;
						} 
						else 
						{
							break;
						}
					}
					if (temp > jump) 
					{
						jump = temp;
						day++;
					}
					i = j - 1;
				}
			}
			System.out.println(day);
		}
		s.close();
	}
}
