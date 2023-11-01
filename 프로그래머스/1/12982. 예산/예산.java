
import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
       
        Arrays.sort(d); // 부서별 신청 금액을 작은 순으로 정렬
        int count = 0; // 지원할 부서의 개수

        for (int i = 0; i < d.length; i++) {
            if (budget >= d[i]) { // 현재 부서의 신청 금액을 예산에서 차감할 수 있는 경우
                budget -= d[i]; // 예산에서 차감
                count++; // 부서 지원 횟수 증가
            } else {
                break; // 더 이상 부서를 지원할 예산이 없으면 종료
            }
        }
        return count;
    }
}
// 최대 몇갱의 부서를 지원할수 있을지 
// 입력을 받는게 d , budget을 입력인데
// 그러며 최대로 지원해줄수있는 부서의 수를 구하는건데
// 그럼 최고값이나 최대값이 필요한지?
// 어떤걸 비교해서 나머지를 만들지 
// 0번 인덱스부터 하나씩 더해서 버젯을 넘어가면 안되고
// 그렇게 해서 최대를 구해야하는건데
// while문 종료조건 컨티뉴 조건
// d[x]=100이하 
