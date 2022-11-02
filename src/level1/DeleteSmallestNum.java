package level1;

//제일 작은 수 제거하기
public class DeleteSmallestNum {

	public static void main(String[] args) {

	}
	public int[] solution(int[] arr) {
		if (arr.length == 1 ) {
					return new int[] { -1 };
				}
				int[] answer = new int[arr.length-1];
				int min = arr[0];
				
				for (int i = 0; i < arr.length; i++) {
					min = arr[i] < min ? arr[i] : min;
				}
				
				for(int i =0, j=0;i<arr.length;i++) {

					if(arr[i] == min) continue;
					else {
						answer[j] = arr[i];
						j++;
					}
				}

				return answer;
		    }

}
