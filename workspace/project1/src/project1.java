import java.util.*;

/**
 * @author CJ
 * This program contains a person class the first and last name protected attributes. Then it has a student class 
 * that inherits the person class, and also collects averages for quizes, homework, tests, and projects. The student class
 * has getters and setters for each attribute. As well as a getter and setter to make the students full name. And a method
 * to calculate the students final grade, and letter grade. The main class starts by printing out a menu. The first option 
 * asks how many students the user will enter, then creates an array the size of the number of students. The program then 
 * prompts the user to enter in the first and last name, and all the averages for the student. The the menu appears again,
 * if the user selects the second option, they will enter the name of the student, and the program will search the array 
 * and print out the name of the student, and the final grade and letter grade. If the student does not exist, then 
 * an error message will pop up, and the menu will appear again. The third option exits the program.
 */

class person
{
	protected String firstname;
	//protected attribute
	protected String lastname;
	//protected attribute
	
	void setfirstname(String fname)
	//sets first name
	{
		this.firstname = fname;
	}
	String getfirstname()
	//gets first name
	{
		return firstname;
	}
	void setlastname(String lname)
	//sets last name
	{
		this.lastname = lname;
	}
	String getlastname()
	//gets last name
	{
		return this.lastname;
	}
	person(String fname, String lname)
	//constructor for the person class
	{
		this.firstname = fname;
		this.lastname = lname;

	}
}
class student extends person
{
	private double hwave;
	private double quizave;
	private double projectave;
	private double testave;
	private double finalgrade;
	private String lettergrade;
	private String fullname;
	//all private variables
	
	void sethwave(int hw)
	// sets the homework average
	{
		this.hwave = hw;
	}
	double gethwave()
	//gets the homework average
	{
		return this.hwave;
	}
	void setquizave(int quizave)
	//sets the quiz average
	{
		this.quizave = quizave;
	}
	double getquizave()
	//gets the quiz average
	{
		return this.quizave;
	}
	void setprojectave(int projectave)
	//sets the project average
	{
		this.projectave = projectave;
	}
	double getprojectave()
	//gets the project average
	{
		return this.projectave;
	}
	void settestave(int testave)
	//sets the test average
	{
		this.testave = testave;
	}
	double gettestave()
	//gets the test average
	{
		return this.testave;
	}
	void setfinalgrade(int finalgrade)
	//sets the final average
	{
		this.finalgrade = finalgrade;
	}
	double getfinalgrade()
	//gets the final grade
	{
		return finalgrade;
	}
	void setlettergrade(String lettergrade)
	//sets the letter grade
	{
		this.lettergrade = lettergrade;
	}
	String getlettergrade()
	//gets the letter grade
	{
		return lettergrade;
	}
	String getfullname()
	//gets full name
	{

		fullname = getlastname() + "," + getfirstname();
		return fullname;
	}
	
	void calcfinal()
	//calclate the final percent and determine grade
	{
		this.finalgrade =  ((quizave*.05)+(testave*.4)+(hwave*.15)+(projectave*.4));
		//formula for calculating the final grade
		if(finalgrade>=90)
		{
			lettergrade = "A";
		}
		else if(finalgrade>=80)
		{
			lettergrade = "B";
		}
		else if(finalgrade >= 70)
		{
			lettergrade = "C";
		}
		else if(finalgrade >=60)
		{
			lettergrade = "D";
		}
		else
		{
			lettergrade = "F";
		}
		//this determines the letter grade
	}
	void displaygrade()
	//this prints out the final grade and letter grade
	{
		System.out.println("Final grade: " + this.finalgrade + "%\nLetter grade: " + lettergrade);
	}
	
	student(String fname, String lname, int homework, int quiz, int project, int test)
	//this is a constructor for the student class
	{
		super(fname, lname);//call the attributes from the parent class
		setfirstname(fname);
		setlastname(lname);
		getfullname();
		sethwave(homework);
		setquizave(quiz);
		setprojectave(project);
		settestave(test);
		calcfinal();
	}
}

public class project1 {


	public static void main(String[] args) {
		
		int choice = 0;
		int icount = 0;
		int numofstud;
		int hwave;
		int qave;
		int pave;
		int tave;
		String studfname;
		String studlname;
		Scanner oscan = new Scanner(System.in);
		boolean bsearch = true;
		//declare all variables
		student aostud[] = null;
		//declare the student array
		
		do
		//this is a loop for the menu
		{
			System.out.println("\nChoose an option:\n1.\tNew Class List\n2.\tSearch for a Student\n3.\tExit\n");
			choice = oscan.nextInt();
			//this prints the menu and inputs the answer
			
			
			if(choice == 1)
			//this is what happens for option 1
			{
				System.out.println("Enter the number of students");
				numofstud = oscan.nextInt();
				aostud = new student[numofstud];
				//this iniciates the array for the number of students
				for(icount = 0; icount< numofstud; icount++)
				//this loop goes until the array is full
				{
					System.out.println("Enter info for Student " + (icount+1));
					System.out.println("What is the students first name?");
					oscan.nextLine();
					studfname = oscan.nextLine();
					System.out.println("What is the student's last name?");
					studlname = oscan.nextLine();
					System.out.println("What is the student's homework average?");
					hwave = oscan.nextInt();
					System.out.println("What is the student's quiz average?");
					qave = oscan.nextInt();
					System.out.println("What is the student's project average?");
					pave = oscan.nextInt();
					System.out.println("What is the student's test average?");
					tave = oscan.nextInt();
					//this prompts the user for all the student information and assigns to variables
					
					aostud[icount]= new student(studfname, studlname, hwave, qave, pave, tave);
					//call the student constructor
				}
			}	
			if(choice == 2)
			{
				String fname;
				String lname;
				icount = 0;
				bsearch = true;
				//declare variables
				
				oscan.nextLine();
				// clear the buffer
				
				System.out.println("Enter a Students last name: ");
				lname = oscan.nextLine();
				System.out.println("Enter a students first name: ");
				fname = oscan.nextLine();
				//ask for first and last name to search the array

				for (icount= 0;(bsearch == true) && (icount < aostud.length); icount ++)
				{
					if ((aostud[icount].getlastname().equalsIgnoreCase(lname)) && (aostud[icount].getfirstname().equalsIgnoreCase(fname)))
					// if the last and first name match, then print the students grades
					{
						System.out.println(aostud[icount].getfullname());
						aostud[icount].displaygrade();
						bsearch = false;
						//set bsearch to false to end the loop
					}
					else if(icount == (aostud.length - 1))
					//prints out an error if the student doesn't exist
					{
						System.out.println("Student does not exist");
					}
				}				
			}
			
		}while (choice != 3);
		//if the option is not 3, the loop will continue
	}
}
