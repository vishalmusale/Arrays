import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		//Input String
		System.out.println("Enter the String: \t");
		StringBuffer str = new StringBuffer(s.nextLine());
		//char[] charArr = str.toCharArray();
		char t;
		
		System.out.println(str.reverse());
		System.out.println(str);
		/*
		for(int i=0, j=str.length() - 1; i<=str.length()/2; i++, j--)
		{
			t=str.charAt(i);
			str.setCharAt(i, str.charAt(j));
			str.setCharAt(j, t);
			
		}
		*/
		
		/*
		//Reversing String
		for(int i=0, j=str.length() - 1; i<=str.length()/2; i++, j--)
		{
			t = charArr[i];
			charArr[i] = charArr[j];
			charArr[j] = t;
		}
		
		//Printing
		for(int x = 0; x<charArr.length; x++)
		{
			System.out.print(charArr[x]);
		}
		
		*/
	}

}
