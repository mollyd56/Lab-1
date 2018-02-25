package pkgCore;

import java.util.LinkedList;

public class Round {

	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();

	public Round() {
		Roll r = new Roll();
		// TODO: Execute Come Out roll, value ComeOutScore
		this.ComeOutScore = r.getScore();
		if(ComeOutScore == 2 ||ComeOutScore == 3 ||ComeOutScore == 12)
			this.eGameResult = CRAPS;
		if(ComeOutScore == 7 ||ComeOutScore == 11)
			this.eGameResult = NATURAL;
		// TODO: Create a loop that will execute a roll until point is made, or
		// seven-out
		while (r.getScore() != ComeOutScore && r.getScore != 7 )
		{
			r.Roll();
		}

		// TODO: value the eGameResult after the round is complete
		if(r.getScore == ComeOutValue)
			this.eGameResult = POINT;
		if(r.getScore == 7)
			this.eGameResult = SEVEN_OUT;
	}

	public int RollCount() {
		// Return the roll count
		return 0;
	}

}
