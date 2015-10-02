import java.util.Scanner;

/**
 * This program takes names and counts the number of vowels that the name has. An array holds all names, and a different 
 * array holds the counts of all the vowels that are used in those names. The program starts out by asking the user 
 * to input how many names they would like to input. This creates an array with that many slots for names. Then the user 
 * is asked to enter in the names. After each name, the count of the vowels are added to their respective variables. After 
 * all the names have been input, the vowel counts are each assigned to a slot in the count array. Then the counts are 
 * printed out.
 */

/**
 * @author CJ Powers
 *
 */
public class quiz3 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int icount = 0;
		int lettercount = 0;
		//this counts each letter of the name
		int namecount = 0;
		//this counts the number of names that the user wants to input
		String sname = null;
		//declare all the variables
		
		Scanner oscan = new Scanner(System.in);
		//call the scanner
		
		int aovowel[] = new int[5];		
		//create an array for the vowel counts


		System.out.println("How many names would you like to enter?");
		namecount = oscan.nextInt();
		//ask how many names the user wants to input, then assign to the namecount variable
		oscan.nextLine();
		//clear the buffer
		
		String aoname[] = new String[namecount];
		//create an array for the names
		
		for (icount=0; icount < namecount; icount++)
		// this loop will go until all the names have been entered
		{
			
			System.out.println("Enter name");	
			sname = oscan.nextLine();
			//ask for the name, then assign to the sname variable
			aoname[icount] = sname;
			//assign the array slot to the name
			for(lettercount=0; lettercount < sname.length(); lettercount++)
			//this loop will go through each letter and determine if it is a vowel
			{
				if(sname.substring(lettercount,lettercount+1).equalsIgnoreCase("A"))
				//if the letter is an "a", then the A counter is increased by 1
				{
					aovowel[0] += 1;
					//assign the array slots to a vowel counter
				}
				else if(sname.substring(lettercount,lettercount+1).equalsIgnoreCase("E"))
				//if the letter is an "e", then the E counter in increased by 1
				{
					aovowel[1] += 1;
					//assign the array slots to a vowel counter
				}				
				else if(sname.substring(lettercount,lettercount+1).equalsIgnoreCase("I"))
				//if the letter is an i then the I counter is increased by 1
				{
					aovowel[2] += 1;
					//assign the array slots to a vowel counter
				}				
				else if(sname.substring(lettercount,lettercount+1).equalsIgnoreCase("O"))
				//if the letter is an o then the O counter is increased by 1
				{
					aovowel[3] += 1;
					//assign the array slots to a vowel counter
				}
				else if(sname.substring(lettercount,lettercount+1).equalsIgnoreCase("U"))
				//if the letter is a u then the U counter is increased by 1
				{
					aovowel[4] += 1;
					//assign the array slots to a vowel counter
				}
			}
		}
		
		System.out.println("A: " + aovowel[0]);
		System.out.println("E: " + aovowel[1]);
		System.out.println("I: " + aovowel[2]);
		System.out.println("O: " + aovowel[3]);
		System.out.println("U: " + aovowel[4]);
		//print out the counts of each vowel
	}

}
