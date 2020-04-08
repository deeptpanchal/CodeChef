import java.util.*;

public class Main 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		int a[] = new int[n1 + n2 + n3];
		for (int i = 0; i < n1 + n2 + n3; i++) 
		{
			a[i] = s.nextInt();
		}
		Arrays.sort(a);
		HashSet<Integer> arr = new HashSet<Integer>();
		for (int i = 0; i < n1 + n2 + n3 - 2; i++) 
		{
			if (a[i] == a[i + 1]) 
			{
				arr.add(a[i]);
			}
		}
		System.out.println(arr.size());
		Object b[] = arr.toArray();
		Arrays.sort(b);
		for (int i = 0; i < arr.size(); i++) 
		{
			System.out.println(b[i]);
		}
		s.close();
	}
}
