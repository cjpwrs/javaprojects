import java.util.Scanner;

/**
 * @author CJ
 * This program contains a person class the first and last name protected attributes. Then it has a student class 
 * that inherits the person class, and also collects the students GPA and student id number. The student class
 * has getters and setters for each attribute. The student class has a constuctor that calls the parent class constructor
 * and sets all the attributes for both classes. The main function asks the user to enter in the the students information,
 * then that information is used to create a new student object, then the student's information in printed out.
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
	private double gpa;
	private String studentid;
	//all private variables
	
void setgpa(double gpa)
//setter for gpa
{
	this.gpa = gpa;
}
double getgpa()
//getter for GPA
{
	return this.gpa;
}
void setstudentid(String studentid)
//setter for student id
{
	this.studentid = studentid;
}
String getstudentid()
//getter for student id
{
	return this.studentid;
}
	
	student(String id, String fname, String lname, double gpa)
	//this is a constructor for the student class
	{
		super(fname, lname);
		//call the attributes from the parent class
		setfirstname(fname);
		setlastname(lname);
		setgpa(gpa);
		setstudentid(id);
	}
}

public class homework7 {


	public static void main(String[] args) {
		
		String studid;
		String studfname;
		String studlname;
		double studgpa;
		Scanner oscan = new Scanner(System.in);
		//declare all variables
					
					System.out.println("What is the student's id number?");
					studid = oscan.nextLine();
					System.out.println("What is the students first name?");
					studfname = oscan.nextLine();
					System.out.println("What is the student's last name?");
					studlname = oscan.nextLine();
					System.out.println("What is the student's GPA?");
					studgpa = oscan.nextDouble();
					//this prompts the user for all the student information and assigns to variables
					
					student aostud = new student (studid, studfname, studlname, studgpa);
					//call the student constructor

					System.out.println("ID: " + aostud.getstudentid());
					System.out.println("Full name: " + aostud.getfirstname() + " " + aostud.getlastname());
					System.out.println("GPA: " + aostud.getgpa());
					//print out the students information
					
	}
}

