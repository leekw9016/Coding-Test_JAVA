class Solution {
    public int solution(String s) {
        String[] numbers = {
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"
        };
        
        for (int i = 0; i < numbers.length; i++) {
            s = s.replace(numbers[i], String.valueOf(i));
        }

        return Integer.parseInt(s);
    }
}
        //영어 단어를 숫자로 바꿔라 
        //숫자는 그대로 숫자로 나오고
        // 그래서 저장된거를 answer에 저장

