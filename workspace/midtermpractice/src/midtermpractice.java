import java.util.*;

class game
{
	String name;
	int pointsfor;
	int pointsagainst;
	int wins = 0;
	int losses = 0;
	
	void gameplay(int pointsfor, int pointsagainst)
	{
		if(pointsfor>pointsagainst)
		{
			wins++;
		}
		else
		{
			losses++;
		}
	}
	int getwins()
	{
		return wins;
	}
	int getlosses()
	{
		return losses;
	}
	void setname(String name)
	{
		this.name = name;
	}
	void  setpointsfor(int pointsfor)
	{
		this.pointsfor = pointsfor;
	}
	void setpointsagainst(int pointsagainst)
	{
		this.pointsagainst=pointsagainst;
	}
	String getname()
	{
		return this.name;
	}
	int getpointsfor()
	{
		return this.pointsfor;
	}
	int getpointsagainst()
	{
		return this.pointsagainst;
	}
	game(String name, int pointsfor, int pointsagainst, int wins, int losses)
	{
		this.name = name;
		this.pointsfor = pointsfor;
		this.pointsagainst = pointsagainst;
		this.wins = wins;
		this.losses = losses;
	}
}

class basketball extends game
{
	String tourstat;
	double winloss;
	
	void setwinloss(int pointsfor, int pointsagainst)
	{
		this.winloss = (double)(pointsfor/(pointsfor+pointsagainst));
	}
	void settourstat(int wins)
	{
		if(wins >= 5)
		{
			this.tourstat = "Good Job";
		}
		else
		{
			this.tourstat = "You Suck";
		}
	}
	double getwinloss()
	{
		return this.winloss;
	}
	String gettourstat()
	{
		return this.tourstat;
	}

	basketball(String name, int pointsfor, int pointsagainst, int wins, int losses) 
	{
		super(name, pointsfor, pointsagainst, wins, losses);
		
		settourstat(wins);
	}
	
}

class midtermpractice
{
	public static void main(String[] args)
	{
		String sname = null;
		int pointsf = 0;
		int pointsa = 0;
		int wins = 0;
		int losses = 0;
		double winloss;
		String stat;
		Scanner oscan = new Scanner(System.in);
		basketball abask[] = new basketball[5];
		Random rdmgenerator = new Random();
		
		for(int icount = 0; icount<abask.length; icount++)
		{
			wins = 0;
			losses = 0;
			System.out.println("Team name:");
			sname = oscan.nextLine();
			for(int icount1 = 1; icount1 <10;icount1++)
			{
				do
				{
					pointsf = rdmgenerator.nextInt(10);
					pointsa = rdmgenerator.nextInt(10);
				}while(pointsf == pointsa);
				
				if(pointsf>pointsa)
				{
					wins++;
				}
				else
				{
					losses++;
				}
			}
			abask[icount] = new basketball(sname, pointsf, pointsa, wins, losses);
		}
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
		for(int icount = 0; icount<abask.length; icount++)
		{
			System.out.println(abask[icount].getname());
			System.out.println(abask[icount].getwins());
			System.out.println(abask[icount].getlosses());
			System.out.println(abask[icount].gettourstat());
		}
		
	}
}
