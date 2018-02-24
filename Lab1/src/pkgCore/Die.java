package pkgCore;

public class Die {

	private int DieValue;

	public Die() {
		// TODO: Determine DieVaue.. a random number between 1 and 6
		int random = (int)(Math.random()*6 + 1);
		this.DieValue = random;
	}

	public int getDieValue() {
		return DieValue;
	}
}
