class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder(); 
        // StringBuilder를 사용하여 문자열을 효율적으로 구축
        // 홀짝 문제로 풀이 
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                answer.append("수");
            } else {
                answer.append("박");
            }
        }

        return answer.toString();
    }
}