package tsm01_J_NCEPbI;

final class Publisher {

	public static volatile Publisher published; 
	int num;

	Publisher(int number) { 
		published = this;
		// Initialization 
		this.num = number;
		// ... 
	}
}