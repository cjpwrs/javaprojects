import java.util.*;

class fruit
{
	String name;
	fruit(String name)
	{
		this.name = name;
	}
}
class apple extends fruit
{
	String type;
	apple(String name, String type) 
	{
		super(name);
		this.type=type;
	}
	
}
public class quick {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	apple aps[] = new apple[5];
	Scanner oscan = new Scanner(System.in);
	Random rdm = new Random();
	int ran;
	String test;
	
	test = oscan.nextLine();
	ran = rdm.nextInt(100);
	
	aps[0] = new apple("Red", "Delicious");
	System.out.println(test + ran+ aps[0].name);

	int numbers[] = new numbers[1,2,3,4,5]
	}

}
