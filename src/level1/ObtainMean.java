package level1;

//평균 구하기
public class ObtainMean {

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 1, 2, 3, 4 }));
		System.out.println(solution(new int[] { 5, 5 }));
	}

	public static double solution(int[] arr) {
		int sum = 0;
		double answer;
		for (int i : arr) {
			sum += i;
		}
		answer = (double) sum / arr.length;
		return answer;
	}

}
