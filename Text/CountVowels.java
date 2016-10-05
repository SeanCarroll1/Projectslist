package Text;

import java.util.Scanner;

public class CountVowels 
{
	public static void main (String []args)
	{
		
		Scanner in= new Scanner(System.in);
		
		String word=in.nextLine();
		
		in.close();
		//Get count of each vowel using regex.
		System.out.println("a Count is : " + word.toLowerCase().replaceAll("[^a]","").length());
		System.out.println("e Count is : " + word.toLowerCase().replaceAll("[^e]","").length());
		System.out.println("i Count is : " + word.toLowerCase().replaceAll("[^i]","").length());
		System.out.println("o Count is : " + word.toLowerCase().replaceAll("[^o]","").length());
		System.out.println("u Count is : " + word.toLowerCase().replaceAll("[^u]","").length());
		
		//Count of all vowels.
		System.out.println("Total count of all vowels is : "+ word.toLowerCase().replaceAll("[^aeiou]","").length());
		
	}
	
}
