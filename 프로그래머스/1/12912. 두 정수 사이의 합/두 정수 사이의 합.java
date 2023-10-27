class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int tmp=0;
        // 1,10이라면
        if(a>b){        
            tmp=a;
            a=b;
            b=tmp;
        }
        
        for(int i=a; i<=b; i++){
            answer+=i;
        }
            
        
    
        // 두정수 사이의 수를 먼저 구해야할듯 
        // 두수가 같으면 a나b 반환
        // 두수는 크기가 상관이없다
        // -> 그러면 ab를 비교해서 작은수를 a에 넣고 
        // for문을 a부터 b까지 돌려서 나온 숫자들의 합을 구해야하는데
        // 이게 어려운데?
        return answer;
    }
}