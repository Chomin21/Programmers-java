package level1;

import java.util.Arrays;

//예산
public class Budget {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,3,2,5,4}, 9));
		System.out.println(solution(new int[] {2,2,3,3}, 10));
	}
	public static int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        int i = 0;
    	Arrays.sort(d);
    	
        while((sum += d[i]) <= budget) { //합이 예산보다 작거나 같은 동안
        	i++;
        	answer++;
        	if(i == d.length) { //i가 끝까지 돈 경우
        		break;
        	}
        }

        return answer;
    }
}
