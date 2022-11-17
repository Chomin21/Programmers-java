package level1;

//문자열 다루기 기본
public class HandlingStringBasic {

	public static void main(String[] args) {
		System.out.println(solution("a234"));
		System.out.println(solution("1234"));
	}
	public static boolean solution(String s) {
	       String regex ="\\d{1,}";
	       
	       if(s.matches(regex)) {
	    	  return s.length() == 4 || s.length() == 6? true : false;
	       } else return false;
	    }
}
