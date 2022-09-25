package level1;

import java.util.*;

//문자열 내 마음대로 정렬하기
public class SortingStringAsMyWill {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new String[] { "sun", "bed", "car" }, 1)));
		System.out.println(Arrays.toString(solution(new String[] { "abce", "abcd", "cdx" }, 2)));
	}

	public static String[] solution(String[] strings, int n) {
		String[] answer = {};

		LinkedHashMap<String, Character> hm = new LinkedHashMap<>();
		for (String s : strings) {
			hm.put(s, s.charAt(n));
		}


		List<Map.Entry<String, Character>> list_ent = new ArrayList<>(hm.entrySet());
		Collections.sort(list_ent, new Comparator<Map.Entry<String, Character>>() {
			@Override
			public int compare(Map.Entry<String, Character> o1, Map.Entry<String, Character> o2) {
				if (o1.getValue() < o2.getValue())
					return -1;
				else if (o1.getValue() > o2.getValue())
					return 1;
				else {
					return o1.getKey().compareTo(o2.getKey());
				}
			}
		});

		answer = new String[list_ent.size()];
		for (int i = 0; i < list_ent.size(); i++) {
			answer[i] = list_ent.get(i).getKey();
		}

		return answer;
	}
}
