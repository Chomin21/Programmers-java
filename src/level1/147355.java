//크기가 작은 부분 문자열
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int tLength = t.length();
        int pLength = p.length();
        
        int endIndex = pLength;
        
        long pNum = Long.parseLong(p);
        
        long partNum;
        for(int startIndex = 0; endIndex <= tLength; startIndex++,endIndex++){
            partNum = Long.parseLong(t.substring(startIndex, endIndex));

            if(partNum <= pNum){
                answer++;
            }
        }
        
        return answer;
    }
    
}
