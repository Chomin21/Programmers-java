package level1;

import java.util.ArrayList;

//자연수 뒤집어 배열로 만들기
public class ReverseNaturalNumToArray {

	public static void main(String[] args) {
		System.out.println(solution(12345));
	}
	public static ArrayList solution(long n) {
        ArrayList arr = new ArrayList();
		
		long num = n;
		while(num > 0) {
			arr.add(num%10);
			num /= 10;
		}
		return arr;
    }
}
