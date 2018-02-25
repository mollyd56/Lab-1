package pkgCore;

public class Roll {

	private Die d1;
	private Die d2;
	private int Score;

	public Roll() {
		// TODO: Create an instance of d1 and d2...
		// TODO: Determine 'Score'
		this.Score = d1.getScore() + d2.getScore();
	}

	public int getScore() {
		return Score;
	}

}
