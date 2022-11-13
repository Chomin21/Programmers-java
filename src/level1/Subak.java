package level1;

//수박수박수박수박수박수?
public class Subak {

	public static void main(String[] args) {
		System.out.println(solution(3));
		System.out.println(solution(4));
	}
	
	
	public static String solution(int n) {
        StringBuffer sb = new StringBuffer();

		for (int i = 0; i < n / 2; i++) {
			sb.append("수박");
		}
		if (n % 2 != 0) {
			sb.append("수");
		}
		return sb.toString();
    }

}
