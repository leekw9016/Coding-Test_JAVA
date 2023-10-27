class Solution {
    public int solution(int n) {
        int answer = 0;
        //  만약 10이라면 
        // 10%x ==1 일때 가장 작은값을 구해야하는데
        // for문이라면 1 2 3 4 ~9
        // 3이 나오면 브레이크 하고 바로 그 값이 출력
        // 12 는 
        for(int i=1; i<n; i++){
            answer=i;
            if (n%i==1){
                break;
            }
        }
        return answer;
    }
}