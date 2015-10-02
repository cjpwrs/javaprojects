import java.util.*;
/**
 * 
 */

/**
 * @author CJ
 *
 */

class Student//creates a Student class
{
	String name;
	int quiz_ave;
	int test_ave;
	int homework_ave;
	String favorite_Subject;
	double final_ave;
	String letter_grade;
	//declare instance variables
	
	void calcfinal()
	//calclate the final percent and determine grade
	{
		this.final_ave = (quiz_ave*.2)+(test_ave*.4)+(homework_ave*.4);
		if(final_ave>=90)
		{
			letter_grade = "A";
		}
		else if(final_ave>=80)
		{
			letter_grade = "B";
		}
		else if(final_ave >= 70)
		{
			letter_grade = "C";
		}
		else
		{
			letter_grade = "E";
		}
	}
	
	Student()//empty constructor
	{
		
	}
	Student(String name, int quiz_ave, int test_ave, int homework_ave, String favorite_Subject)
	//constructor
	{
		this.name = name;
		this.quiz_ave = quiz_ave;
		this.test_ave = test_ave;
		this.homework_ave = homework_ave;
		this.favorite_Subject = favorite_Subject;
		calcfinal();
	}
	
}

public class StudentInfo 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Student aostud[] = new Student[3];
		Scanner oscan = new Scanner(System.in);
		String name;
		int quiz;
		int test;
		int homework;
		String favorite;
		int icount;
		//declare variables
		
		for(icount=0; icount<3; icount++)
		//loop to create all the objects of student for the array
		{
			System.out.println("What is the student name?");
			name = oscan.nextLine();
			System.out.println("What is the quiz average?");
			quiz = oscan.nextInt();
			System.out.println("What is the test average?");
			test = oscan.nextInt();
			System.out.println("What is the homework average?");
			homework = oscan.nextInt();
			oscan.nextLine();
			System.out.println("What is the students favorite subject?");
			favorite = oscan.nextLine();
			//collect the input for each object
			aostud[icount]= new Student(name, quiz, test, homework, favorite);
			//create a new object of Student
		}
		System.out.println("NAME\tSUBJECT\tAVE\tGRADE\t");
		
		for(icount=aostud.length-1; icount>=0; icount--)
		//loop through the array in reverse order and print results
		{
			System.out.println(aostud[icount].name +"\t" + aostud[icount].favorite_Subject + "\t" + aostud[icount].final_ave + "\t" + aostud[icount].letter_grade);
		}

	}

}
