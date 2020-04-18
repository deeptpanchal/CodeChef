import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) 
		{
			String str = s.next();
			Stack<Character> stack = new Stack<>();
			for (int i = 0; i < str.length(); i++) 
			{
				if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') 
				{
					System.out.print(str.charAt(i));
				} 
				else if (str.charAt(i) == ')') 
				{
					while (stack.peek() != '(') 
					{
						System.out.print(stack.pop());
					}
					stack.pop();
				} 
				else 
				{
					stack.push(str.charAt(i));
				}
			}
			System.out.println();
		}
		s.close();
	}
}
