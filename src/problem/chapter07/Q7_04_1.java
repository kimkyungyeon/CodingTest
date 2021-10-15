package problem.chapter07;

import java.util.Scanner;

public class Q7_04_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(solution(i)+ " ");
        }
    }

    private static int solution(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return solution(n - 2) + solution(n - 1);
        }
        
    }
}
