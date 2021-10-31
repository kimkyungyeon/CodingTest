package problem.chapter09;

import java.util.Scanner;

public class Q9_1_0 {
    static int n, count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        solution(0);
        System.out.println(count);

    }

    private static void solution(int l) {
        if (l > n) {
            return;
        }
        if (l == n) {
            count++;
        } else {
            solution(l + 1);
            solution(l + 2);
        }
    }
}
