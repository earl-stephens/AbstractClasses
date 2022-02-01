package application;

public class Monster extends GameObject {

	@Override
	public void describe() {
		// required since the super class has the abstract method
		System.out.println("I am a monster");
		
	}

}
