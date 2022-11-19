package level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//모의고사
public class MockTest {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 1, 2, 3, 4, 5 })));
		System.out.println(Arrays.toString(solution(new int[] { 1, 3, 2, 4, 2 })));
	}

	public static int[] solution(int[] answers) {
		int[][] arr = new int[][] { { 1, 2, 3, 4, 5 }, { 2, 1, 2, 3, 2, 4, 2, 5 }, { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 } };

		Map<Integer, Integer> score = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			int cnt = 0;
			int len = arr[i].length;
			score.put(i + 1, 0);
			while (cnt < answers.length) {
				if (answers[cnt] == arr[i][cnt % len]) {
					score.put(i + 1, score.get(i + 1) + 1);
				}
				cnt++;
			}
		}

		int[] answer = new int[] { 0, 0, 0 };
		int maxScore = Collections.max(score.values());

		int k = 0;
		for (int key : score.keySet()) {
			if (score.get(key) == maxScore) {
				answer[k++] = key;
			}
		}
		if (k < 3) {
			answer = Arrays.copyOfRange(answer, 0, k);
		}
		return answer;
	}
}