package level1;

import java.util.ArrayList;
import java.util.Collections;

//3진법
public class TernaryScale {

	public static void main(String[] args) {
		System.out.println(solution(45));
		System.out.println(solution(125));
	}
	public static int solution(int n) {
        ArrayList <Integer> arr = new ArrayList<>();
      
        int answer = 0;

        while(n > 0) { 	
        	arr.add(n % 3);
        	n = n / 3;
        }
        int len = arr.size();
        for(int i=0;i<len;i++) {
        	answer += arr.get(i) * Math.pow(3, len - 1 - i);
        }
        
        return answer;
    }
}
