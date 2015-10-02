
/*
 * @author CJ Powers
 * This program has two classes, one for the stats of a basketball team, and another that 
 * has the instructions for the program. The program starts by asking for your name, if you
 * answer 'Y', the program goes, if you answer 'N', the program stops. After answering yes, 
 * the user will be prompted to enter in a team name, then to enter in the name of an opponent.
 * The program will then generate a random score for your team and the opposing team. The first
 * game that is played, your team gets an extra 5 points, and the next game, the opposing team
 * gets an extra 5 points, this alternates continually. In the case of a tie, the program will play 
 * overtime until the tie is broken by generating a random score, and adding it to the total game
 * score. At the end of the game, the score will be displayed, and if overtime happened, then the
 * number of overtimes will be shown. All of your teams stats will be updated at the end of
 * each game. You will then be asked if you would like to play again, as long as you keep answering 'y',
 * the program will continue executing. However, once you answer no, your teams stats from all the games
 * will appear. Then the program is done.
 */
import java.text.DecimalFormat;
import java.util.*;
class basketball
{
	String teamname;  
	int total_points_for = 0; 
	int total_points_against = 0;
	int iwincounter = 0;
	int ilosecounter = 0;
	double winpercent;// to calculate the percent of games won	
	String padString(String sValue, int length)
	{
	int iCount;
	for (iCount = sValue.length(); iCount < length; iCount++)
	{
	sValue = sValue + " ";
	}

	return sValue;
	}
}

public class homework4 
{
	

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 basketball obasket = new basketball();
		 Random rndGenerator= new Random();
		 Scanner myscan= new Scanner(System.in);
		 DecimalFormat df = new DecimalFormat("0.00");
		 int iscore_home = 0;
		 int iscore_away = 0;
		 int overtime_for;
		 int overtime_against;
		  //declare variables for both teams
		 int igames = 1; //to keep a count of the number of games to be played
		 int inum = 1; //to keep a count of the number of games played

		 int overtimecounter;
		 //to count the wins and losses for the home team
		 double igamecounter = 0;//to count the number of games played
	
		
		 
		 String opponentname;
		 String schoice;
		 //declare variable to display the names of the teams
		 
		 System.out.println("Would you like to play the game?(Y/N)");
		 schoice=myscan.nextLine();
		 
		 if(schoice.equalsIgnoreCase ("Y"))//the first time the user answers 'y', the program will ask for your team name
		 {
			 System.out.println("What is the name of your team?");  
			 obasket.teamname= myscan.nextLine();
		 }
		

		 while (schoice.equalsIgnoreCase ("Y"))//a loop while the answer is yes, it ignores upper and lower case
		 {
			 

			 for(igames=1; igames < 2; igames++)
			 //this loop will go for one game
			 {
				 overtimecounter = 0;
				 System.out.println("What is the name of the away team?");
				 opponentname = myscan.nextLine();
				 System.out.println("");
				 if(inum % 2 == 0)//this determines if the game number is even
				 {
				 iscore_home = rndGenerator.nextInt( 101 ); //generate a random score
				 iscore_away = rndGenerator.nextInt( 101 ); //generate a random score
				 iscore_away = iscore_away + 5; //on even games, the opposing team gets 5 extra points
				 }
				 else //this is for odd games
				 {
					iscore_home = rndGenerator.nextInt( 101 ); //generate a random score
				 	iscore_away = rndGenerator.nextInt( 101 ); //generate a random score
				 	iscore_home = iscore_home + 5; // on odd games, your team gets 5 extra points
				 }
				 while(iscore_home == iscore_away)//this loop will go as long as there is a tie
				 {
					 overtime_for = rndGenerator.nextInt( 16 ); //generate a random score
					 overtime_against= rndGenerator.nextInt( 16 ); //generate a random score
					 iscore_home = iscore_home + overtime_for;
					 iscore_away = iscore_away + overtime_against;
					 overtimecounter++;
				 }
				 
				 System.out.println(obasket.teamname + ": " + iscore_home);
				 System.out.println("");
				 System.out.println(opponentname + ": " + iscore_away);
				 System.out.println("");
				 if(overtimecounter>0)
				 {
					 System.out.println("OT " + overtimecounter);
					 System.out.println("");
				 }
		     
				 // display the score of both teams, and insert a blank line after the score
				 // display the number of overtimes if there were any
		     
				 if(iscore_home > iscore_away)
		     	 {
					 System.out.println(obasket.teamname +  " WINS");
					 obasket.iwincounter++;
					 igamecounter++;
		    	 }
				 else
		     	 {
					 System.out.println(obasket.teamname + " LOSES");
					 obasket.ilosecounter++;
					 igamecounter++;
		     	 }
				 System.out.println("");
		         // display who won
				 inum++;//increment the number of games played by 1
			 }
			 System.out.println("Would you like to play again?(Y/N)");
			 //ask if they would like to play again for  the loop
			 schoice = myscan.nextLine();
			 System.out.println("");
			 obasket.total_points_for+= iscore_home;
			 obasket.total_points_against += iscore_away;
			 obasket.winpercent = obasket.iwincounter/igamecounter * 100;
	
			 //add the total points for and against for the team's stats
			 
		 }
		 	 String spercent = df.format(obasket.winpercent);
			 System.out.println("Team Name\tW\tL\tPct\tPoint For\tPoints Against ");
			 System.out.println("");
			 System.out.println("--------\t---\t---\t----\t--------\t-------------");
			 System.out.println("");
			 System.out.print(obasket.padString(obasket.teamname, 16) + obasket.iwincounter + "\t" + obasket.ilosecounter +"\t");
			 System.out.println(spercent + "%\t" + obasket.total_points_for + "\t\t" + obasket.total_points_against);
			 //print the stats of the home team

			 
		 	
	}

}