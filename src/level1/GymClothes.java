package level1;

import java.util.Arrays;

//체육복
public class GymClothes {

   public static void main(String[] args) {
      System.out.println(solution(5, new int[] { 2, 4 }, new int[] { 1, 3, 5 }));
      System.out.println(solution(5, new int[] { 2, 4 }, new int[] { 3 }));
      System.out.println(solution(3, new int[] { 3 }, new int[] { 1 }));
      System.out.println(solution(3, new int[] { 2, 3 }, new int[] { 3 }));
   }

   public static int solution(int n, int[] lost, int[] reserve) {

      // 순서대로 주어진다는 보장이 없으므로 정렬.
      Arrays.sort(lost);
      Arrays.sort(reserve);

      int[] wearing = new int[n + 1];

      
      for (int i = 0; i < lost.length; i++) {
         for (int t = 0; t < reserve.length; t++) {
            if (lost[i] == reserve[t]) { //lost와 reserve에 중복 학생이 있는 경우 걸러내기
               lost[i] = -1;
               reserve[t] = -1;
            }
         }
         // 여전히 잃어버린 애들만 wearing에서 -1로 만들기.
         if (lost[i] != -1)
            wearing[lost[i]] -= 1;
      }

      for (int j = 0; j < reserve.length; j++) {
         if (reserve[j] != -1) {
            for (int i = 1; i < wearing.length; i++) {
               if (wearing[i] == -1) {
                  if (reserve[j] - 1 == i || reserve[j] == i || reserve[j] + 1 == i) {
                     wearing[i] += 1;
                     break;
                  }
               }
            }
         }
      }
      int count = 0;
      for (int k = 1; k < wearing.length; k++) {
         if (wearing[k] == 0) {
            count++;
         }
      }
      return count;
   }
}