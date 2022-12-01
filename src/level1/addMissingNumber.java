package level1;

import java.util.Arrays;

//없는 숫자 더하기
public class addMissingNumber {

	public static void main(String[] args) {
		System.out.println(solution(new int[]{1,2,3,4,6,7,8,0}));
		System.out.println(solution(new int[]{5,8,4,0,6,7,9}));
	}

	 public static int solution(int[] numbers) {
	        int sum = 0;

			Arrays.sort(numbers);
			int k = 0;
			int len = numbers.length;
			for (int i = 0; i < 10; i++, k++) {
				if (k >= len) {
					sum += i;
				} else if (numbers[k] != i) {
					sum += i;
					k--;
				}
			}
			return sum;
	    }
}
