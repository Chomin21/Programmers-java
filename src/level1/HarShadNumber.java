package level1;

//하샤드 수
public class HarShadNumber {

	public static void main(String[] args) {
		System.out.println(solution(10));
		System.out.println(solution(12));
		System.out.println(solution(11));
		System.out.println(solution(13));
		
	}

	public static boolean solution(int x) {
        boolean answer = true;

		int num = x;
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		
		answer = x % sum == 0 ? true : false;
		return answer;
    }
}
