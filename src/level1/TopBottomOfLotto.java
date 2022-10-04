package level1;

import java.util.Arrays;

//로또의 최고순위와 최저순위

public class TopBottomOfLotto {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 44, 1, 0, 0, 31, 25 }, new int[] { 31, 10, 45, 1, 6, 19 })));

		System.out.println(Arrays.toString(solution(new int[] { 0, 0, 0, 0, 0, 0 }, new int[] { 38, 19, 20, 40, 15, 25 })));
		System.out.println(Arrays.toString(solution(new int[] { 45, 4, 35, 20, 3, 9 }, new int[] { 20, 9, 3, 45, 4, 35 })));
	}

	public static int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];
		int zeroNum = 0, cnt = 0;
		int[] rank = { 6, 6, 5, 4, 3, 2, 1 }; // 인덱스 == 맞춘 갯수

		Arrays.sort(lottos);
		Arrays.sort(win_nums);
		for (int i : lottos) {
			if (i == 0) {
				zeroNum++;
				continue;
			}
			for (int k : win_nums) {
				if (i == k) {
					cnt++;
					continue;
				}
			}
		}
		answer[0] = rank[cnt + zeroNum];
		answer[1] = rank[cnt];
		return answer;
	}
}
