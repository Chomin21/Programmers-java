package level1;

//약수의 개수와 덧셈
public class DivisorCountCalc {

	public static void main(String[] args) {
		System.out.println(solution(13, 17));
		System.out.println(solution(24, 27));
	}
	public static int solution(int left, int right) {
	      int sum=0;
			for(int i = left; i<=right;i++) {

				int cnt = 0;
				for(int j = 1; j <= i;j++) {
					if(i % j == 0) {
						cnt++;
					}
				}
				if(cnt% 2 == 0) {
					sum += i;
				} else sum -= i;
			}
			return sum;
	    }
}
