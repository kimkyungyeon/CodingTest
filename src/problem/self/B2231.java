package problem.self;

import java.util.Scanner;

public class B2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 1;
        int sum;

        while (cnt < N) {
            sum = 0;
            int number = cnt;
            while (number != 0) {
                sum += number % 10;
                number = number / 10;
            }
            sum += cnt;

            if (sum == N) {
                break;
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}
