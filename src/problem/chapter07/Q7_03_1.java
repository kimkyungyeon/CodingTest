package problem.chapter07;

import java.util.Scanner;

public class Q7_03_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(solution(n));
    }

    private static int solution(int n) {
        if (n == 1) {
            return 1;
        } else  return n * solution(n - 1);

    }
}
