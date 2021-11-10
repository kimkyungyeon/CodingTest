package problem.class2;

import java.util.Scanner;

public class B2805 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        int max = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }

        int min = 0;
        int mid = 0;

        while (min <= max) {

            mid = (max + min) / 2;
            long answer = 0;
            System.out.println("min : " + min);
            System.out.println("mid : " + mid);
            System.out.println("max : " + max);
            for (int x : arr) {
                if (x >= mid) {
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
