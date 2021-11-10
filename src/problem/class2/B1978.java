package problem.class2;

import java.util.Scanner;

public class B1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(N, arr));
    }

    private static int solution(int n, int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isPrime = true;
            if (arr[i] == 1) {
                isPrime = false;
            }
            for (int j = 2; j < arr[i]; j++) {
                if ((arr[i] % j == 0)) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
            }
        }
        return count;
    }
}
