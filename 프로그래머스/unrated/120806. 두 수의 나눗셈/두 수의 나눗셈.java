class Solution {
    public int solution(int num1, int num2) {
        if (num2 != 0) {
            double result = ((double) num1 / num2) * 1000;
            int intResult = (int) result;
            return intResult;
        } else {
           
            return 0; // 또는 다른 값을 반환
        }
    }
}






