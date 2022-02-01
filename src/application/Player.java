package application;

public class Player extends GameObject {

	@Override
	public void describe() {
		// required since the super class has the abstract method
		System.out.println("I am the player");
		
	}

}
