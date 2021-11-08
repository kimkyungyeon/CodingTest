package problem.class2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class B1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[] arr = new int[M];
        for (int i = 0; i < M; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(A);
        for (int i = 0; i < M; i++) {
            boolean flag = false;
            int min = 0;
            int max = A.length - 1;
            int mid = 0;
            while (min <= max) {
                mid = (min + max) / 2;
                if (arr[i] > A[mid]) {
                    min = mid + 1;
                } else if (arr[i] < A[mid]) {
                    max = mid - 1;
                } else if (arr[i] == A[mid]) {
                    flag = true;
                    array.add(1);
                    break;
                }
            }
            if (!flag) {
                array.add(0);
            }
        }

        for (int x : array) {
            System.out.println(x);
        }
    }
}
