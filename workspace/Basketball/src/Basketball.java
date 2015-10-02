/**
 * 
 */

/**
 * @author CJ
 *
 */
import java.util.*;
public class Basketball {

	/**
	 * @param args
	 * this program generates a random score for BYU and U of U, then 
	 * displays the score of both, and tells who won
	 */
	public static void main(String[] args) {

		 Random rndGenerator= new Random();
		 
		 int iBYU, iUofU; //declare variables for both teams
		 
		 iBYU = rndGenerator.nextInt( 100 ); //generate a random score
	     iUofU= rndGenerator.nextInt( 100 ); //generate a random score
	     
	     System.out.println("BYU: " + iBYU);
	     System.out.println("U of U: " + iUofU);
	     System.out.println("");
	     // display the score of both teams, and insert a blank line
	     
	     if(iBYU>iUofU ){
	    	 System.out.println("YAY! BYU WINS!!");}
	     if(iUofU>iBYU){
	    	 System.out.println("BOO! U of U wins");}
	     // display who won
	     }
	     
	}



