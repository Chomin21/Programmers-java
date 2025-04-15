import java.util.*;

// 가장 가까운 글자
class Solution {
    public int[] solution(String s) {
        int inputStrLength = s.length(); // 문자열 길이
        int[] answer = new int[inputStrLength];
        Map<Character, Integer> charIndexMap = new HashMap<>(); // key=char, value=index
        
        char inputStrChar;
        int prevCharIndex = 0; // 바로 이전 동일한 char의 index
        int sameCharIndexDiff; // 바로 이전 동일한 char의 index와 차이
        for(int i = 0; i < inputStrLength ; i++){
            inputStrChar = s.charAt(i);
            sameCharIndexDiff = -1;
          
            if(charIndexMap.containsKey(inputStrChar)){
                prevCharIndex = charIndexMap.get(inputStrChar);
                sameCharIndexDiff = i - prevCharIndex;
            }
            
            charIndexMap.put(inputStrChar, i);
            answer[i] = sameCharIndexDiff;
        }
        return answer;
    }
}
