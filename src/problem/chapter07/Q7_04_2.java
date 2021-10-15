package problem.chapter07;

import java.util.Scanner;

public class Q7_04_2 {
    static int[] fibo;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        fibo = new int[n + 1];
        solution(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i]+ " ");
        }
    }

    private static int solution(int n) {
        if (n == 1) {
            return fibo[1] = 1;
        } else if (n == 2) {
            return fibo[2] = 1;
        } else {
            return fibo[n] = solution(n - 2) + solution(n - 1);
        }
        
    }
}
