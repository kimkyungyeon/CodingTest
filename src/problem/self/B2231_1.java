package problem.self;

import java.util.Scanner;

public class B2231_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        int sum;

        for (int i = 1; i < N; i++) {
            sum = 0;
            int number = i;
            while (number != 0) {
                sum += number % 10;
                number = number / 10;
            }

            if (sum + i == N) {
                cnt = i;
                break;
            }
        }
        System.out.println(cnt);
    }
}
