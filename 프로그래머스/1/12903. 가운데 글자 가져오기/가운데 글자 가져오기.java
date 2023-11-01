class Solution {
    public String solution(String s) {
        String answer = "";
             if (s.length() % 2 == 1) {  // 문자열의 길이가 홀수인 경우
            int middleIndex = s.length() / 2;
            answer = s.charAt(middleIndex) + ""; // 문자를 문자열로 변환하여 반환
        } else {  // 길이가 짝수인 경우
            int middleIndex = s.length() / 2;   // 2로 나눠 몫을 구하기 
            answer = s.substring(middleIndex - 1, middleIndex + 1); // 가운데 두 글자 반환
        }
        return answer;
        //글자수 반환 인데 가운데 반환 
        // 홀수라면 가운데 1개 반환 , 짝수라면 가운데 2개 반환 
        // 그러면 반환식 이있고 그다음 이프문을 통해 1 or 2 반환
        // 홀수는 %==1 홀수 짝수는 나머지라고 했을때 
        // s 
        // 글자수를 어떻게 셀것인가 
    }
}