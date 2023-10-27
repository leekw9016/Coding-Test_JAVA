import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
      while (n > 0) {
            int A = n % 10; // N의 일의 자릿수 추출
            answer += A; // 자릿수를 누적하여 더함
            n /= 10; // N을 한 자릿수 줄임
        }
        

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}