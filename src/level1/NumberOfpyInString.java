package level1;

//문자열 내 p와 y의 개수
public class NumberOfpyInString {

	public static void main(String[] args) {
		System.out.println(solution("pPoooyY"));
		System.out.println(solution("Pyy"));
	}
	
	public static boolean solution(String s) {
	       boolean answer = true;

			int numP = 0, numY = 0;
			s = s.toUpperCase();

			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == 'P')
					numP++;
				else if (s.charAt(i) == 'Y')
					numY++;
			}
			answer = numP == numY ? true:false;
			return answer;
	    }
}
