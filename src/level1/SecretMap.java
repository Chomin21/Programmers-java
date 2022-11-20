package level1;

import java.util.Arrays;

//비밀지도
public class SecretMap {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(5, new int[] {9, 20, 28, 18, 11}, new int[] {30, 1, 21, 17, 28})));
		System.out.println(Arrays.toString(solution(6, new int[] {46, 33, 33 ,22, 31, 50}, new int[] {27 ,56, 19, 14, 14, 10})));
	}
	
	public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] binaryArr1 = new String[n];
        String[] binaryArr2 = new String[n];
        
        for(int i = 0; i < n; i++) {
        	binaryArr1[i] = String.format("%0"+n+"d", Long.parseLong(Long.toBinaryString(arr1[i])));	
        	binaryArr2[i] = String.format("%0"+n+"d", Long.parseLong(Long.toBinaryString(arr2[i])));
        }
        
        for(int i = 0; i < n;i++) {
        	String binaryNum = "";
        	for(int j = 0; j < n; j++) {
        		if(binaryArr1[i].charAt(j) == '1' ||  binaryArr2[i].charAt(j) == '1') {
        			binaryNum += "#";
        		}else {
        			binaryNum += " ";
        		}
        		
        	}
        	answer[i]=binaryNum;
        }
        
        return answer;
    }

}