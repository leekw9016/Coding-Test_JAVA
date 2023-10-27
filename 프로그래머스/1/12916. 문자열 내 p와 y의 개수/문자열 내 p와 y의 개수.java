class Solution {
    boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;

        // 문자열 s의 각 문자를 순회하며 'P'와 'Y'의 개수를 센다
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //문자열 객체에 속한 메서드로, 문자열 내에서 지정된 인덱스(i)에 위치한 문자를 반환.
            //인덱스는 0부터 시작하며, charAt 메서드를 사용하여 해당 인덱스의 문자를 얻을 수 있습니다.
            if (c == 'P' || c == 'p') {
                pCount++;
            } else if (c == 'Y' || c == 'y') {
                yCount++;
            }
        }

        // 'P'와 'Y'의 개수를 비교하여 결과를 반환
        return pCount == yCount;
    }
}