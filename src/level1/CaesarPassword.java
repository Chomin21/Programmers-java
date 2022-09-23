package level1;

//시저 암호
public class CaesarPassword {

	public static void main(String[] args) {
		System.out.println(solution("AB", 1));
		System.out.println(solution("z", 1));
		System.out.println(solution("a B z", 4));
	}

	public static String solution(String s, int n) {
		StringBuilder sb = new StringBuilder();
		char ch;
		for (char c : s.toCharArray()) {
			if (c == ' ') {
				sb.append(" ");
				continue;
			}
			ch = (char) ((int) c + n);
			if (Character.isLowerCase(c) && (ch > 'z')) { // 소문자인 경우
				ch = (char) ('a' + ch - 'z' - 1);
			} else if (Character.isUpperCase(c) && (ch > 'Z')) {
				ch = (char) ('A' + ch - 'Z' - 1);
			}
			sb.append(Character.toString(ch));
		}

		return sb.toString();
	}
}
