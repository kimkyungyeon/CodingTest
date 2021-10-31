package problem.chapter09;

import java.util.Scanner;

public class Q9_2_0 {
    static int[] dy;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dy = new int[n + 2];

        System.out.println(solution(n));

    }

    private static int solution(int n) {
        dy[1] = 1;
        dy[2] = 2;
        for (int i = 3; i <= n+1; i++) {
            dy[i] = dy[i - 2] + dy[i - 1];
        }
        return dy[n+1];
    }
}
