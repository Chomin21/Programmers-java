package level1;

//나머지가 1이 되는 수 찾기
public class FindNumRemainderOf1 {

	public static void main(String[] args) {
		System.out.println(solution(10));
		System.out.println(solution(12));
	}
	
	public static int solution(int n) {
        int i = 2;
		for(;i<n;i++) {
			if(n % i == 1) break;
		}
		return i;
    }

}
