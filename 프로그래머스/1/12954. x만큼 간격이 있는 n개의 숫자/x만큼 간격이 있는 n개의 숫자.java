class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        // x를 n 번 곱하는데  답은 x*1,x*2,....
        for (int i = 0; i < n; i++) {
            answer[i] = (long) x * (i + 1);
        }
        // 배열에 하나씩 저장해주는데 i+1이되면서 돌도록
        return answer;
    }
}






