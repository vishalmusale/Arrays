import java.util.Arrays;
import java.util.Scanner;

/*	Anagram :- 	listen & silent	
 * 
 * 	Idea:- Convert String to Char Array		str.toCharArray()
 * 			sort it using 					Arrays.sort(a)
 * 			compare 2 char Array			Arrays.equal(a,b)*/

public class Anagram
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		//Input		
		System.out.println("Enter a String 1: ");
		String str1 = s.nextLine();

		System.out.println("Enter a String 2: ");
		String str2 = s.nextLine();

		
		//Converting to Character Array
		char[] a = str1.toCharArray();
		char[] b = str2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		
		if(Arrays.equals(a, b))
		{
			System.out.println("Anagram!!!");
		}					
		else
		{
			System.out.println("NOT Anagram :( ");
		}
				
	}
}