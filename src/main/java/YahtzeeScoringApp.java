import java.util.ArrayList;

public class YahtzeeScoringApp {

	public static void main(String[] args) {
		int[] arr = { 2, 2, 3, 4, 5 };
		int t1 = 0, t2 = 0, t3 = 0, t4 = 0, score;

		if (arr[0] == arr[1]) {
			t1 = arr[0] + arr[1];
		}

		if (arr[1] == arr[2]) {
			t2 = arr[1] + arr[2];
		}

		if (arr[2] == arr[3]) {
			t3 = arr[2] + arr[3];
		}

		if (arr[3] == arr[4]) {
			t4 = arr[3] + arr[4];
		}
		
		score = t1 + t2 + t3 + t4;
		
	}
	

}
