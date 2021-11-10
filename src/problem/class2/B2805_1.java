package problem.class2;

import java.util.Scanner;

public class B2805_1 {
    private static int N;
    private static int M;
    private static int[] arr;
    private static long max = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        M = scanner.nextInt();

        arr = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = scanner.nextInt();
            max = Math.max(max, arr[i]);
        }

        long min = 0;

        while (min <= max) {
            long mid = (min + max) / 2;
            long answer = 0;

            System.out.println("min : " + min);
            System.out.println("mid : " + mid);
            System.out.println("max : " + max);

            for (int x : arr) {
                if (x > mid) {
                    answer += x - mid;
                }
            }
            System.out.println("answer : " + answer);
            if (answer >= M) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }

        System.out.println(max);
    }
}
