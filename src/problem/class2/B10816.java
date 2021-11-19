package problem.class2;

import java.util.Arrays;
import java.util.Scanner;

//숫자카드 2
public class B10816 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int m = sc.nextInt();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int key = sc.nextInt();

            str.append(upper_bound(arr, key) - lower_bound(arr, key)).append(" ");
        }
        System.out.println(str);

    }

    private static int lower_bound(int[] arr, int key) {
        int min = 0;
        int max = arr.length;
        while (min < max) {
            int mid = (min + max) / 2;
            if (key <= arr[mid]) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        return min;
    }

    private static int upper_bound(int[] arr, int key) {
        int min = 0;
        int max = arr.length;
        while (min < max) {
            int mid = (min + max) / 2;
            if (key < arr[mid]) {
                max = mid;
            } else {
                min = mid+1;
            }
        }
        return min;
    }
}
