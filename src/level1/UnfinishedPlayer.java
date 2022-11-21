package level1;

import java.util.HashMap;

//완주하지 못한 선수
public class UnfinishedPlayer {

	public static void main(String[] args) {

		System.out.println(solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
		System.out.println(solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"}));
		System.out.println(solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));
	}
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
		int cnt;
		HashMap<String, Integer> map = new HashMap();
		for (int i = 0; i < participant.length; i++) {
			if (map.containsKey(participant[i])) {
				cnt = map.get(participant[i]);
				map.put(participant[i], cnt + 1);
			} else {
				map.put(participant[i], 1);
			}
		}

		for (int j = 0; j < completion.length; j++) {
			if (map.containsKey(completion[j])) {
				cnt = map.get(completion[j]);
				map.put(completion[j], cnt - 1);
			}
		}
		for(String key : map.keySet()) {
			if(map.get(key)==1) answer = key;
		}
		return answer;
    }

}
