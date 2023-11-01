import java.util.Scanner;

// 그러면 * 찍어야하니까 for문을 돌리는데 2중으로 돌려야겠지?
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println(); // 각 행 끝에 줄 바꿈
        }
    }
}