package level1;

//소수 찾기
public class FindPrimeNumber {

	public static void main(String[] args) {
		System.out.println(solution(2));
		System.out.println(solution(3));
		System.out.println(solution(10));
		System.out.println(solution(5));
	}

	public static int solution(int n) {
		int answer = 0;
		int[] arr = new int[n + 1];
		for (int i = 0; i <= n; i++) {
			arr[i] = i;
		}
		arr[1] = 0;

		//합성수들은 소수들의 곱으로 이루어짐.
		for (int i = 2; i <= n; i++) {
			//소수가 아니면 넘어가기
			if (arr[i] == 0)
				continue;

			// 소수인 경우 그 배수들을 모두 찾아서 소수가 아니라고 정의.
			for (int j = i * 2; j <= n; j += i) {
				arr[j] = 0;
			}
		}

		//소수인 것만 찾기
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				answer++;
			}
		}

		return answer;
	}
}
