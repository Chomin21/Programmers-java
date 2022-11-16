package level1;

//부족한 금액 계산하기
public class AddInsufficientMoney {

	public static void main(String[] args) {
		System.out.println(solution(3, 20, 4));
	}

	public static long solution(int price, int money, int count) {
		long sum = 0;
		for (int i = 1; i <= count; i++) {
			sum += price * i;
		}

		return sum > money ? sum - money : 0;
	}
}
