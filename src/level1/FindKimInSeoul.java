package level1;

//서울에서 김서방 찾기
public class FindKimInSeoul {

	public static void main(String[] args) {
		System.out.println(solution(new String[]{"Jane", "Kim"}));
	}
	
	public static String solution(String[] seoul) {
        int x=-1;
       
       for(int i = 0; i < seoul.length;i++) {
       	if(seoul[i].equals("Kim")) {
       		x = i;
       		break;
       	}
       }
       return "김서방은 "+x+"에 있다";
   }
}
