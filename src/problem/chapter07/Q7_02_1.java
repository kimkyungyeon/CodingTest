package problem.chapter07;

import java.util.Scanner;

public class Q7_02_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        solution(n);
    }

    private static void solution(int n) {
        if (n == 0) {
            return;
        }
        int a = n/2;
        solution(a);
        System.out.print(n%2);
    }
}
