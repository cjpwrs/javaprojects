import java.util.Scanner;

/**
 * 
 */

/*
 * @author CJ
 * This program was modified from the homework5 program on 02/20/14
 * This program includes at class called myTeam, which contains various methods for calling 
 * and setting the values of a basketball team. It also contains 2 constructor methods, the
 * first one has a parameter for the team name, and the second contains parameters for the
 * team name, the wins, the losses, the points for, and the points against.
 * The main class contains 2 arrays. The first array uses the constructor that passes the team
 * name only, the user is prompted to input all the stats for the team, then the setters from the
 * myTeam class are used to assign those stats to variables. The stats are then printed. The
 * second array uses the constructor method that receives the team name, wins, losses, points for,
 * and points against. The user is prompted to enter in these stats, and then the stats are printed
 * by calling the getter methods from the myTeam class. Then the program is done.
 */

class myTeam
{
	private String teamname;  
	private int total_points_for = 0; 
	private int total_points_against = 0;
	private int iwincounter = 0;
	private int ilosecounter = 0;
	private double winlosspct;
	//declare variables, updated on 02/20/14 to private variables
	
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
	private int getpercent()//this gets the percent of games won, changed to a private method on 02/20/14
	{
		return (int)this.winlosspct;
	}
	void addpoints(int total_points_for, int total_points_against)//this adds points to the to the total points for
	{
		this.total_points_for =this.total_points_for + total_points_for;
		this.total_points_against =this.total_points_against + total_points_against;
	}
	void addpoints(int points, String steam)//this adds points to the total points against
	{
		if(steam.equalsIgnoreCase("h"))//if the teamname parameter is h, then add points for
		{
			this.total_points_for += points;
		}
		else if(steam.equalsIgnoreCase("o"))//if the team name parameter is 0, then add points against
		{
			this.total_points_against += points;
		}
		
	}
	void getallpoints()//this prints out the total points for and against the team
	{
		System.out.println("The total points for are " + this.total_points_for + ", the " +
				"total points against are " + this.total_points_against);
	}
	myTeam(String teamname)// this constructor constructs an object with the team name
	{
		setteam(teamname);
	}
	myTeam(String teamname, int wins, int losses, int pointsfor, int pointsagainst)
	// This constructor constucts an objects with the team name, wins, losses, points for, and points against
	{
		setteam(teamname);
		setwinslosses(wins, losses);
		addpoints(pointsfor, "h");//add points for when "h" or "H" is used
		addpoints(pointsagainst, "o");//add points against when "o" or "O" is used
	}
}

public class homework6 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner oscan = new Scanner(System.in);//assign a scanner
		String sholdteam;
		myTeam aoTeam[] = new myTeam[2];//create an array with 2 slots
		int iwins=0;
		int ilosses=0;
		int pointsfor = 0;
		int pointsagainst = 0;
		//declare variables

		System.out.println("Enter the team name:");
		sholdteam = oscan.nextLine();
		//prompt the user for the team name, then assign to the team variable
		
		aoTeam[0] = new myTeam(sholdteam);
		/*
		create a new object of myTeam in the 0 array slot, this object uses the constructor that
		just asks for the team name
		*/
		
		System.out.println("How many wins?");
		iwins = oscan.nextInt();
		System.out.println("How many losses?");
		ilosses = oscan.nextInt();
		System.out.println("How many points did the team score?");
		pointsfor = oscan.nextInt();
		System.out.println("How many points were scored against the team?");
		pointsagainst = oscan.nextInt();
		// prompt the user to enter in the stats for the team. Then assign them to variable
		
		aoTeam[0].addpoints(pointsfor, pointsagainst);//this sets the points for
		aoTeam[0].setwinslosses(iwins, ilosses);//this sets the wins  and losses and calculates the win percent
		oscan.nextLine();
		
		System.out.println( "Team name: " + aoTeam[0].getteam());//this gets the team name
		System.out.println("Wins: " + aoTeam[0].getwins());//this prints the wins
		System.out.println("Losses: " + aoTeam[0].getloses());//this prints the losses
		aoTeam[0].getallpoints();//this prints the total points for and against
		
		//this is the beginning of the second array
		System.out.println("Enter the team name:");
		sholdteam = oscan.nextLine();		
		System.out.println("How many wins?");
		iwins = oscan.nextInt();
		System.out.println("How many losses?");
		ilosses = oscan.nextInt();
		System.out.println("How many points did the team score?");
		pointsfor = oscan.nextInt();
		System.out.println("How many points were scored against the team?");
		pointsagainst = oscan.nextInt();
		//prompt the user for all of the teams stats, then assign them to variables
		
		aoTeam[1] = new myTeam(sholdteam, iwins, ilosses, pointsfor, pointsagainst);
		//create another object of myTeam using the constructor that uses all the teams stats
		
		System.out.println( "Team name: " + aoTeam[1].getteam());//this gets the team name
		System.out.println("Wins: " + aoTeam[1].getwins());//this prints the wins
		System.out.println("Losses: " + aoTeam[1].getloses());//this prints the losses
		aoTeam[1].getallpoints();//this prints the total points for and against
	}

}

