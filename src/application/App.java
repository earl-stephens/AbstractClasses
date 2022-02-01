package application;

public class App {

	public static void main(String[] args) {
		/* Can't do new GameObject(); because in the
		 * GameObject class we used the abstract keyword
		 */
		
		/* In this case we don't want to/need to create a 
		 * GameObject object.  We only need GameObject to 
		 * act as a super class for Player & Monster
		 */
		GameObject[] objs = {new Player(), new Monster()};
		
		for(var obj: objs) {
			System.out.println(obj);
			obj.describe();
		}

	}

}
