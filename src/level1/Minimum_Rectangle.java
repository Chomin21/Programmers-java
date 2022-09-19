package level1;

import java.util.Arrays;

//최소 직사각형
public class Minimum_Rectangle {

	public static void main(String[] args) {
		System.out.println(solution(new int[][] { { 30, 70 }, { 60, 50 }, { 60, 30 }, { 80, 40 } }));
		System.out.println(solution(new int[][] { { 10, 7 }, { 12, 3 }, { 8, 15 }, { 14, 7 }, { 5, 15 } }));
		System.out.println(solution(new int[][] { { 14, 4 }, { 19, 6 }, { 6, 16 }, { 18, 7 }, { 7, 11 } }));
	}

	public static int solution(int[][] sizes) {
		int answer = 0;
		int len = sizes.length;

		int max_x = 0;
		int max_y = 0;

		int temp;
		for (int i = 0; i < len; i++) {
			if (sizes[i][0] < sizes[i][1]) {
				temp = sizes[i][0];
				sizes[i][0] = sizes[i][1];
				sizes[i][1] = temp;
			}
			if (max_x < sizes[i][0])
				max_x = sizes[i][0];
			if (max_y < sizes[i][1])
				max_y = sizes[i][1];
		}
		answer = max_x * max_y;
		return answer;
	}
}
