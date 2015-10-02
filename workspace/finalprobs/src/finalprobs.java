import java.util.Scanner;




class  MealTime
{
   String Breakfast;
   String Lunch;
   String Dinner;
   Boolean bHungry;
   
   void setmeal(String mealtype, boolean bHungry)
   {
	   
	   this.bHungry = bHungry;
	   if (this.bHungry = true)
	   {
		   if(mealtype.equals("B"))
		   {
			  this.Breakfast = "Bacon";
		   }
		   if(mealtype.equals("L"))
		   {
			   this.Lunch = "Bacon";
		   }
		   if(mealtype.equals("D"))
		   {
			   this.Dinner = "Lots of Bacon";
		   }
	   }
   }
	   

}


 
 
public class finalprobs
{
   public static void main(String[] args)
   {
  
	   
	    
			   
	   int iCount = 10;

	   switch(iCount)
	   {
	      case 5:
	         System.out.println("Hi");
	         break;
	      case 10:
	         System.out.println("Bye");
	         break;
	   }
	  
 
   }
}
