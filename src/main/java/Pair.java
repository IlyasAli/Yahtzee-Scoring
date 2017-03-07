import java.util.ArrayList;

public class Pair implements ScoringStrategy {

	@Override
	public int computeScore(int[] s) {
		int score = 0;

		ArrayList<Integer> num = new ArrayList<>(); // declare integer arraylist

		for (int i = 0; i < s.length; i++) { // add array elements to arraylist
			num.add(s[i]);

		}
		num.sort(null); // sort in order

		for (int i = 0; i < num.size(); i++) { // compare elements and add them
			for (int j = i + 1; j < num.size(); j++) {
				if (num.get(i) == num.get(j)) {
					score = num.get(i) + num.get(j);
				}

			}

		}

		return score;
	}
}
