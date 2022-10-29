package level1;

//핸드폰 번호 가리기
public class hidePhoneNumber {

	public static void main(String[] args) {
		System.out.println(solution("01033334444"));
		System.out.println(solution("027778888"));
	}
	
	public static String solution(String phone_number) {
        String answer = "";
		int len = phone_number.length();
		String last = phone_number.substring(len-4,len);
		String first = phone_number.substring(0,len-4);
		char[] chars = first.toCharArray();
		for(int i = 0;i<chars.length;i++) {
			chars[i] = '*';
		}
		answer = String.valueOf(chars) + last;
		return answer;
    }

}
