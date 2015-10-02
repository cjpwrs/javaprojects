 class team
 {
	 String name;
	 int numofplayers; 
 }
 class sportsteam extends team
 {
	 int wins;
	 int losses;
	 double winlosspct;
	 
	 public void calcwinlosspct()
	 {
		 winlosspct = (double) wins / (wins+ losses) * .5;
	 }
 }
 class basketball extends sportsteam
 {
	 int numofrebounds;
	 int pointsscored;
	 
	 basketball()
	 {
		 super();
	 }
 }
public class parentstuff {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		basketball oball = new basketball();
	}

}
