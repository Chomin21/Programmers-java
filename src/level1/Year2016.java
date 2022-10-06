package level1;

import java.util.Calendar;
import java.util.GregorianCalendar;

//2016년
public class Year2016 {

	public static void main(String[] args) {
		System.out.println(solution(5, 24));
	}

	public static String solution(int a, int b) {
		String[] days = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		Calendar c = new GregorianCalendar(2016, a - 1, b);
		int t = c.get(Calendar.DAY_OF_WEEK);

		return days[t - 1];
	}
}
