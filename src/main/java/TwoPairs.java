import java.util.ArrayList;

public class TwoPairs implements ScoringStrategy {

	@Override
	public int computeScore(int[] s) {
		
		int t1 = 0, t2 = 0, t3 = 0, t4 = 0, score;

		if (s[0] == s[1]) {
			t1 = s[0] + s[1];
		}

		if (s[1] == s[2]) {
			t2 = s[1] + s[2];
		}

		if (s[2] == s[3]) {
			t3 = s[2] + s[3];
		}

		if (s[3] == s[4]) {
			t4 = s[3] + s[4];
		}
		
		score = t1 + t2 + t3 + t4;
		
		return score;
	}

}
