package level1;

//자릿수 더하기
public class SumOfCiphers {

	public static void main(String[] args) {
		System.out.println(solution(123));
		System.out.println(solution(987));
	}
	 public static int solution(int n) {
	        int answer = 0;

			while(n >= 1) {
				answer += n % 10;
				n /= 10;
			}
			return answer;
	    }
}
