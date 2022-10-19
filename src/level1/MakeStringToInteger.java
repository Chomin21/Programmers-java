package level1;

//문자열을 정수로 만들기
public class MakeStringToInteger {

	public static void main(String[] args) {
		System.out.println(solution("1234"));
		System.out.println(solution("-1234"));
	}
	public static int solution(String s) {
        int num = Integer.parseInt(s);
		return num;
    }
}
