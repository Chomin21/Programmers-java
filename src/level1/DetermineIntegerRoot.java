package level1;

//정수 제곱근 판별
public class DetermineIntegerRoot {

	public static void main(String[] args) {
		System.out.println(solution(121));
		System.out.println(solution(3));
	}

	public static long solution(long n) {
        long answer;
		long len = n / 2;
		double num = Math.sqrt(n);
		
		if(Math.ceil(num) == Math.floor(num))
			answer = (long)Math.pow(num+1, 2);
		else answer = -1;
		
		return answer;
    }
}
