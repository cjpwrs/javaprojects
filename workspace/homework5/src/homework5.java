import java.util.Scanner;

/**
 * 
 */

/*
 * @author CJ
 * This program includes at class called myTeam, which contains various methods for calling 
 * and setting the values of a basketball team. The main class contains an array that goes 
 * up to 3. Each array starts by asking the user to enter in a few values for a basketball 
 * team, such as Team name, wins, losses, how many points they scored, and how many points 
 * were scored on them. These values are then assigned to variables from the myTeam class 
 * by using setter methods. After values have been entered for all three teams then the program
 * will ask the user to enter in a team to search for. The program will search all of the teams
 * until it finds the one that matches what the user entered. The program will then print out
 * all of the stats for that team by calling the getter methods from the myTeam class. Then 
 * the program is done.
 */

class myTeam
{
	String teamname;  
	int total_points_for = 0; 
	int total_points_against = 0;
	int iwincounter = 0;
	int ilosecounter = 0;
	double winlosspct;
	//declare variables
	
	String getteam()//this method returns the team name
	{
		return this.teamname;
	}
	
	void setteam(String sname)//this method accepts a string input and assigns it to sname
	{
		this.teamname = sname;
	}
	
	void setwinslosses(int iwincounter, int ilosecounter)//this sets the win and lose counters and calculates the win percentage
	{
		this.iwincounter = iwincounter;
		this.ilosecounter = ilosecounter;
		
		winlosspct = ((double)iwincounter / (double) (iwincounter + ilosecounter)*100);
	}
	int getwins()//this returns the number of wins
	{
		return this.iwincounter;
	}
	int getloses()//this returns the number of losses
	{
		return this.ilosecounter;
	}
	int getpercent()//this gets the percent of games won
	{
		return (int)this.winlosspct;
	}
	void addpointsfor(int total_points_for)//this adds points to the to the total points for
	{
		this.total_points_for = total_points_for;
	}
	void addpointsagainst(int total_points_against)//this adds points to the total points against
	{
		this.total_points_against = total_points_against;
	}
	void getallpoints()//this prints out the total points for and against the team
	{
		System.out.println("The total points for are " + this.total_points_for + ", the " +
				"total points against are " + this.total_points_against);
	}
	
}

public class homework5 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner oscan = new Scanner(System.in);//assign a scanner
		String sholdteam;
		myTeam aoTeam[] = new myTeam[3];//create an array
		boolean bsearch = true;
		int icount;
		int iwins=0;
		int ilosses=0;
		int pointsfor = 0;
		int pointsagainst = 0;
		//declare variables
		
		for (icount = 0; icount < 3; icount++)//this loop will create 3 teams
		{
			System.out.println("Enter the team name:");
			sholdteam = oscan.nextLine();

			aoTeam[icount] = new myTeam();
			aoTeam[icount].setteam(sholdteam);//set sholdname to teamname
			
			System.out.println("How many wins?");
			iwins = oscan.nextInt();
			System.out.println("How many losses?");
			ilosses = oscan.nextInt();
			System.out.println("How many points did the team score?");
			pointsfor = oscan.nextInt();
			System.out.println("How many points were scored against the team?");
			pointsagainst = oscan.nextInt();
			aoTeam[icount].addpointsfor(pointsfor);//this sets the points for
			aoTeam[icount].addpointsagainst(pointsagainst);//this sets the points against
			aoTeam[icount].setwinslosses(iwins, ilosses);//this sets the wins  and losses and calculates the win percent
			oscan.nextLine();
		}
					
		System.out.println("What team would you like to search for?");//this allows the user to search for a team
		sholdteam = oscan.nextLine();
		icount = 0;
		
		while ((bsearch == true) && (icount < aoTeam.length))//this will search all the teams
		{
			if (aoTeam[icount].getteam().equalsIgnoreCase(sholdteam))
			{
				System.out.println( "Team name: " + aoTeam[icount].getteam());//this gets the team name
				System.out.println("Wins: " + aoTeam[icount].getwins());//this prints the wins
				System.out.println("Losses: " + aoTeam[icount].getloses());//this prints the losses
				aoTeam[icount].getallpoints();//this prints the total points for and against
				System.out.println("The percent of games the team won was " + aoTeam[icount].getpercent() + "%");//this prints out the percent of games won
				bsearch = false;//this ends the while loop
			}
			icount++;//increment the counter
		}
	}

}
