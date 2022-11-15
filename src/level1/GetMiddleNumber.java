package level1;

//가운데 글자 가져오기
public class GetMiddleNumber {

	public static void main(String[] args) {
		System.out.println(solution("abcde"));
		System.out.println(solution("qwer"));
	}

	public static String solution(String s) {
        StringBuffer sb = new StringBuffer();
		 
		 int len = s.length();
		 int mid = len/2;
		 
		 if(len % 2 == 0) {
			 sb.append(s.charAt(mid-1));
			 sb.append(s.charAt(mid));
		 }else sb.append(s.charAt(mid));
		 
	     return sb.toString();
    }
}
