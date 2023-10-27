class Solution {
    public double solution(int[] arr) {
        double avg = 0.0;
        double sum=0.0;
        
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];    //배열의 값을 다 더해줌
        }
        avg=sum/(arr.length);   // 총합을 배열의 길이만큼 나눠서 평균을 구해준다
   
        return avg;
    }
}