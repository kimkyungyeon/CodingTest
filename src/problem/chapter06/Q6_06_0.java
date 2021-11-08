package problem.chapter06;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Q6_06_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        solution(N, arr);
    }

    private static void solution(int n, int[] arr) {
        int[] a = arr.clone();
//        for (int i = 0; i < n; i++) {
//            a[i] = arr[i];
//        }

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if (arr[i] != a[i]) {
                System.out.print(i+1+" ");
            }
        }
    }
}