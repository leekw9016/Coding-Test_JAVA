class Solution {
    public long solution(long n) {
        long answer = 0;
        //n==x*x -> (x+1)*(x+1)
        //n!=x*x -> -1
        
        long A = (long)Math.sqrt(n);    //제곱근을 구하고 
    
        if (n==A*A){
            answer=(A+1)*(A+1);     
        }else
            answer=-1;
    
        return answer;
    }
}