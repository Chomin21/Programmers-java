package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

//다트게임
public class DartGame {

	public static void main(String[] args) {
		System.out.println(solution("1S2D*3T")); //37
		System.out.println(solution("1D2S#10S")); //9
		System.out.println(solution("1S*2T*3S")); //23
		System.out.println(solution("1T2D3D#")); //-4
	}
	public static int solution(String dartResult) {
        int answer = 0;
        int[] arr1 = new int[3];
        int[] arr2 = new int[] {1,1,1,1} ;
        String[] arr = dartResult.split("");
        String content = "";
        int cnt = 0;
        
        for(int i = 0; i < arr.length;i++) {
        	if(arr[i].equals("S")) {
        		arr1[cnt]=(Integer.parseInt(content));
        		cnt++;
        		content = "";
        	}else if (arr[i].equals("D")) {
        		arr1[cnt]=((int)Math.pow(Integer.parseInt(content), 2));
        		cnt++;
        		content = "";
        	}else if(arr[i].equals("T")) {
        		arr1[cnt]=((int)Math.pow(Integer.parseInt(content), 3));
        		cnt++;
        		content = "";
        	}else if(arr[i].equals("*")){
        		arr2[cnt] *= 2;
        		arr2[cnt-1] *= 2;
        		content = "";
        	} else if (arr[i].equals("#")) {
        		arr2[cnt] *= (-1);
        		content = "";
        	}
        	else {
        		content += arr[i];
        		
        	}
        }
        for(int i = 0; i <3;i++) {
        	answer += (arr1[i] * arr2[i+1]);
        }
        return answer;
    }

}
