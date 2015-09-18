import java.util.Scanner;

/* determine if a string has All UNIQUE CHARACTERS */

public class AllUniqueChar {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		//Input String
		System.out.print("Enter String:\t");
		String str = s.nextLine();	
		
		boolean[] ch = new boolean[127];
		for(int i =0; i<str.length(); i++)
		{
			
			if(ch[(int)str.charAt(i)] == true)
			{
				System.out.print("Not Unique");
				break;
			}
			else
			{
				ch[(int)str.charAt(i)] = true;
			}
		}
		
		System.out.print("Unique");
		
	}
}