class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        // 자.... 생각 시작하자 (price*n) 1~c까지 돌릴건데
        // 만약에 money 보다 크면 -얼마의 결과값을 리턴
        // 그게 아니라면 0을 리턴 

        for (int i = 1; i <= count; i++) {
            answer += price * i;
        }
        
        return (answer > money) ? answer - money : 0;
    }
}