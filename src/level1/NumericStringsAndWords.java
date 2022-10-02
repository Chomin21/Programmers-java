package level1;

//숫자 문자열과 영단어
public class NumericStringsAndWords {

	public static void main(String[] args) {
		System.out.println(solution("one4seveneight"));
		System.out.println(solution("23four5six7"));
		System.out.println(solution("2three45sixseven"));
		System.out.println(solution("123"));
		System.out.println(solution("1"));
	}

	public static int solution(String s) {
		int answer = 0;

		String[] numArr = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

		int k = 0;
		String temp;
		for (int i = 0; i < s.length(); i++) {
			temp = s.substring(k, i + 1);

			if (temp.length() == 1 && Character.isDigit(temp.charAt(0))) {
				answer = answer * 10 + Integer.parseInt(temp);
				k = i + 1;
				continue;
			}
			for (int j = 0; j < numArr.length; j++) {
				if (temp.equals(numArr[j])) {
					answer = answer * 10 + j;
					k = i + 1;
				}
			}

		}

		return answer;
	}

}
