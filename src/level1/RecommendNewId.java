package level1;

//신규 아이디 추천
public class RecommendNewId {

	public static void main(String[] args) {
		System.out.println(solution("...!@BaT#*..y.abcdefghijklm"));
		System.out.println(solution("z-+.^."));
		System.out.println(solution("=.="));
		System.out.println(solution("123_.def"));
		System.out.println(solution("abcdefghijklmn.p"));
	}
	// 대소문자, 숫자, 특수문자( -_.~!@#$%^&*()=+[{]}:?,<>/)
	// - _ . 만 가능
	public static String solution(String new_id) {
		new_id = new_id.toLowerCase();
		new_id = new_id.replaceAll("[^-|_|.|a-z|0-9]", "");
		new_id = new_id.replaceAll("\\.+", ".");

		if (!new_id.equals("") && new_id.charAt(0) == '.') {
			new_id = new_id.substring(1);
		}
		if (!new_id.equals("") && new_id.charAt(new_id.length() - 1) == '.') {
			new_id = new_id.substring(0, new_id.length() - 1);
		}
		
		int len = new_id.length();
		if (new_id.equals("")) {
			new_id = "aaa";
		} else if (len > 15) {
			new_id = new_id.substring(0, 15);
			if (!new_id.equals("") && new_id.charAt(new_id.length() - 1) == '.') {
				new_id = new_id.substring(0, new_id.length() - 1);
			}
		} else if (len < 3) {
			while (len < 3) {
				new_id += new_id.substring(len - 1);
				len++;
			}
		}
		
		return new_id;
	}

}
