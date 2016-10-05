package Text;

import java.util.Scanner;

public class PigLatin
{
	public static void main (String []args)
	{
		
		Scanner in= new Scanner(System.in);
		
		String word=in.next();
		
		in.close();
		StringBuilder result = new StringBuilder();
		
		if (Character.toString(word.charAt(0)).matches("[aeiou]"))
		{
			result.append(word + "way");						 
		}else
		{
			result.append(word.substring(1)+word.charAt(0) + "ay");			
		}
		
		System.out.println(result.toString());
	}
}
