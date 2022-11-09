package level1;

import java.util.ArrayList;
import java.util.Iterator;

//같은 숫자는 싫어
public class HateSameNumber {

	public static void main(String[] args) {
		
	}
	
	public static int[] solution(int []arr) {
        int[] answer;
        
        ArrayList<Integer> al = new ArrayList<>();
        
        al.add(arr[0]);
        for(int i =1;i<arr.length;i++) {
        	if(arr[i] != arr[i-1]) al.add(arr[i]);
        	
        }
        answer = new int[al.size()];
        
        Iterator<Integer> ir = al.iterator();
        int i = 0;
        while(ir.hasNext()) {
        	int num = ir.next();
        	answer[i++] = num;

        }
        return answer;
    }

}
