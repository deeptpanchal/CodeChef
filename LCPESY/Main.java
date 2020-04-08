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
			char b[] = s.next().toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
			if (a.length > b.length) 
			{
				char temp[] = a;
				a = b;
				b = temp;
			}
			int count = 0;
			int j = 0;
			for (int i = 0; i < a.length; i++) 
			{
				if (a[i] == b[j]) 
				{
					count++;
					j++;
				} else if (a[i] > b[j]) 
				{
					i--;
					j++;
				}
				if (j >= b.length) 
				{
					break;
				}
			}
			System.out.println(count);
		}
		s.close();
	}
}
