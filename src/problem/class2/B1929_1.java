package problem.class2;

import java.util.ArrayList;
import java.util.Scanner;

public class B1929_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[] arr = new int[N + 1];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i <= N; i++) {
            if (arr[i] == 0) {
                for (int j = i; j <= N; j += i) {
                    arr[j] = 1;
                }
                arr[i] = 0;
            }
        }

        for (int i = M; i <= N; i++) {
            if (arr[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
