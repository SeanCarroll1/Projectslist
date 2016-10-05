package Text;

import java.util.Scanner;

public class ReverseAString 
{
	public static void main (String []args)
	{
		Scanner in= new Scanner(System.in);
		
		String word=in.next();
		
		in.close();
		
		StringBuilder reverse=new StringBuilder();
		
		for(int i=word.length()-1; i>=0; i--)
		{
			reverse.append(word.charAt(i));
		}
		
		System.out.print(reverse);
	}
}
