/*java function that checks if the input string contains all the 
letters of the alphabet a-z (case-insensitive) */

import java.util.Scanner;
public class AlphabetList
{
    public static void main(String args[])
    {
        int arr[] = new int[26];
		int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        
		/*check for length of the string.
        if the length of the string < 26,
        it is clear that it can't contain all alphabet*/
		
        if(str.length() >= 26)
        {
            char ch = '\0';
            char temp = '\0';
            for(int i=0; i<str.length(); i++)
            {
                ch = str.charAt(i);
                if(Character.isLetter(ch))
                {
                   temp = Character.toLowerCase(ch);

                   /*Below line represents that the character is present
                   at the given location and we are inserting 1
                   to represent that character is present in string*/

                   arr[temp - 'a'] = 1;
                }
                else
                    continue;
            }
			for(int val : arr)
			{
				if(val == 1)
					count++;
			}
			if(count == 26)
				System.out.println("Given String contains all alphabet");
			else
				System.out.println("Given String does not contain all alphabet");
        }
        else
        {
            System.out.println("Given String doesn't contain all alphabet");
        }
		sc.close();
    }
}
//time complexity : O(n) (i.e equal to length of string)
//space complexity : O(1) (space complexity is constant here)
