package problem.class2;

import java.util.Scanner;

public class B1654_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        long N = sc.nextInt();

        int[] arr = new int[K];
        long max = 0;

        for (int i = 0; i < K; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }


        long lt = 1;
        long mid = 0;
        while (lt <=  max) {
            mid = (lt + max) / 2;
            long answer = 0;
            for (int i = 0; i < arr.length; i++) {
                answer += arr[i] / mid;
            }

            if (answer >= N) {
                lt = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        System.out.println(max);
    }
}
