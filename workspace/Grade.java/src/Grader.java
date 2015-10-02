import java.text.DecimalFormat;
import java.util.*;

class Person
{
	protected String FirstName;
	protected String LastName;
	//these variables are protected so
	//that only the child class can access them
	
	//setters
	protected void setFirstName(String Fname)
	{
		this.FirstName = Fname;
	}
	protected void setLastName(String Lname)
	{
		this.LastName = Lname;
	}
	//getters
	protected String getFirstName()
	{
		return this.FirstName;
	}
	protected String getLastName()
	{
		return this.LastName;
	}
	
	//Constructor
	Person(String firstname, String lastname)
	{
		this.FirstName = firstname;
		this.LastName = lastname;
	}
}

class Student extends Person
//inherits from the Person class
{
	private double FinalScore;
	private String LetterGrade;
	private int HomeworkAverage;
	private int QuizAverage;
	private int MidtermExam;
	private int FinalExam;
	private int id;
	//declare instance variables
	//they are all private
	
	//setters
	void setFinalScore(int hw, int quiz, int midterm, int finalexam)
	//this uses all the students scores to calculate their final score
	{
		this.FinalScore = (int)((.5)*(hw) + (.05)*(quiz) + (.20)*(midterm) + (.25)*(finalexam));
	}
	void setLetterGrade(double finalscore)
	//this uses the final score of a student to calculate their letter grade
	{
		if (finalscore>=90)
		{
			this.LetterGrade = "A";
		}
		else if (finalscore >=80)
		{
			this.LetterGrade = "B";
		}
		else if (finalscore >= 70)
		{
			this.LetterGrade = "C";
		}
		else
		{
			this.LetterGrade = "F";
		}
	}
	void setHomeworkAverage(int homework)
	{
		this.HomeworkAverage = homework;
	}
	void setQuizAverage(int quiz)
	{
		this.QuizAverage = quiz;
	}
	void setMidtermExam(int midterm)
	{
		this.MidtermExam = midterm;
	}
	void setFinalExam(int finalexam)
	{
		this.FinalExam = finalexam;
	}
	void setid(int id)
	{
		this.id = id;
	}
	
	//getters
	double getFinalScore()
	{
		return this.FinalScore;
	}
	String getLetterGrade()
	{
		return this.LetterGrade;
	}
	int getHomeworkAverage()
	{
		return this.HomeworkAverage;
	}
	int getQuizAverage()
	{
		return this.QuizAverage;
	}
	int getMidtermExam()
	{
		return this.MidtermExam;
	}
	int getFinalExam()
	{
		return this.FinalExam;
	}
	int getid()
	{
		return this.id;
	}
	
	//print methods
	void PrintStudent()
	{
		System.out.println(this.getFirstName()+" "+this.getLastName()+"\t"+this.getFinalScore()+"%\t\t"+this.getLetterGrade());
	}
	void PrintStudent(int id)
	//this will print a student whose id matches the inputed id
	{
		if(this.id == id)
		{
		System.out.println(this.getFirstName()+" "+this.getLastName()+"\t"+this.getFinalScore()+"%\t\t"+this.getLetterGrade());
		}
	}
	
	
	//constructors
	Student(int id, String firstname, String lastname) 
	{
		super(firstname, lastname);
		this.id = id;
	}
	
	Student(int id, String firstname, String lastname, int homework, int quiz, int midterm, int finalexam)
	//this will construct a student, and calculate the final and letter grade
	{
		super(firstname, lastname);
		setid(id);
		setFirstName(firstname);
		setLastName(lastname);
		setHomeworkAverage(homework);
		setQuizAverage(quiz);
		setMidtermExam(midterm);
		setFinalExam(finalexam);
		setFinalScore(homework, quiz, midterm, finalexam);
		setLetterGrade(getFinalScore());
	}
}




public class Grader 
{
	public static void main(String[] args) 
	{
		int homeave = 0;
		int quizave = 0;
		int midterm = 0;
		int finalexam = 0;
		int id;
		String fname;
		String lname;
		DecimalFormat df = new DecimalFormat("###");
		//declare variables
		Scanner oscan = new Scanner(System.in);
		//create a scanner
		Student disney[]= new Student[3];
		//declare an array of Student objects
		
		
		for(int icount1 = 0; icount1 < disney.length; icount1++)
		//this will loop through all the students
		{
			System.out.println("Enter the Student's ID:");
			id = oscan.nextInt();
			oscan.nextLine();
			//clear the buffer
			System.out.println("Enter the Student's First Name:");
			fname = oscan.nextLine();
			System.out.println("Enter the Student's Last Name:");
			lname = oscan.nextLine();
			//receive input from the user
			
			for(int icount2 = 0; icount2 <4; icount2++)
			//this will loop through the different scores
			{
				switch(icount2)
				//this determine which score to be entered
				{
					case 0:
					System.out.println("Enter the Homework Average:");
					homeave = oscan.nextInt();
					break;
					case 1:
					System.out.println("Enter the Quiz Average:");
					quizave = oscan.nextInt();
					break;
					case 2:
					System.out.println("Enter the Midterm Score:");
					midterm = oscan.nextInt();
					break;
					case 3:
					System.out.println("Enter the Final Score:");
					finalexam = oscan.nextInt();
					break;
				}
			}
			disney[icount1] = new Student(id, fname, lname, homeave, quizave, midterm, finalexam);
			//create a new student
		}
		
		//This will sort the Array with the highest scores first
		Student temp[] = new Student[1];
		for(int icount1 = 0; icount1 < disney.length; icount1++)
		{
			for(int icount2 = disney.length-1; icount2 > icount1; icount2--)
			{
				if(disney[icount2-1].getFinalScore() < disney[icount2].getFinalScore())
				{
					temp[0] = disney[icount2-1];
					disney[icount2-1] = disney[icount2];
					disney[icount2] = temp[0];
				}
			}
		}
		
		System.out.println("Student Name\tFinal Score\tLetter Grade");
		System.out.println("------------\t-----------\t------------");
		//this is the layout for dispaying scores
		for(int icount = 0; icount<disney.length; icount++)
		//this will print out all of the students stats
		{
			disney[icount].PrintStudent();
		}
	}
}
