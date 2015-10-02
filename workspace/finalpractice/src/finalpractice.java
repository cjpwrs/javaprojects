import java.text.DecimalFormat;
import java.util.*;
class team
{
	String name;
	int wins;
	int losses;
	int getwins()
	{
		return this.wins;
	}
	int getlosses()
	{
		return this.losses;
	}
	team(String name, int wins, int losses)
	{
		this.name = name;
		this.wins = wins;
		this.losses = losses;
	}
}
class basketball extends team
{
	int pointsfor;
	int pointsagainst;
	double winloss;
	
	void calcwinloss()
	{
		this.winloss = (double)(wins)/(wins+losses)*100;
	}
	double getwinloss()
	{
		return this.winloss;
	}

	basketball(String name, int wins, int losses) 
	{
		super(name, wins, losses);
		calcwinloss();
	}
	
}

public class finalpractice 
{

	public static void main(String[] args) 
	{
		basketball abask[] = new basketball[1];
		Scanner oscan = new Scanner(System.in);
		Random rdm = new Random();
		int wins = 0;
		int losses = 0;
		int pointsf = 0;
		int pointsa = 0;
		String name= null;
		double winloss;
		DecimalFormat df =new DecimalFormat("##.00");
		
		for(int icount = 0; icount < abask.length; icount++)
		{
			wins = 0;
			losses = 0;
			System.out.println("Enter team name");
			name = oscan.nextLine();
			
			for(int icount2 = 0; icount2 < 20; icount2++)
			{
				do
				{
					pointsf= rdm.nextInt(100);
					pointsa = rdm.nextInt(100);
				}while(pointsf == pointsa);
				if(pointsf > pointsa)
				{
					wins++;
				}
				else
				{
					losses++;
				}
			}
			abask[icount] = new basketball(name, wins, losses);
		}
		//sort
		basketball temp[] = new basketball[1];
		for(int icount = 0; icount < abask.length; icount++)
		{
			for(int icount2 = abask.length-1; icount2>icount; icount2--)
			{
				if(abask[icount2-1].getwins()<abask[icount2].getwins())
				{
					temp[0] = abask[icount2-1];
					abask[icount2-1] = abask[icount2];
					abask[icount2] = temp[0];
				}
			}
		}
		//print out
		for(int icount = 0; icount<abask.length;icount++)
		{
			System.out.println(abask[icount].name);
			System.out.println(abask[icount].getwins());
			System.out.println(abask[icount].getlosses());
			System.out.println(df.format(abask[icount].getwinloss()));
		}
		switch(wins)
		{
		case(5):
		{
			System.out.println("Nice");
		}
		break;
		case(10):
		{
			System.out.println("OK");
		}
		break;
		}
			
	}

}
