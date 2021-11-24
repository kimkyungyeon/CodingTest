package problem.chapter03;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3_01_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr1 = new int[N];
        for (int i = 0; i < N; i++) {
            arr1[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        int[] arr2 = new int[M];
        for (int i = 0; i < M; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int x : solution(arr1, arr2)) {
            System.out.print(x + " ");
        }
    }

    private static ArrayList<Integer> solution(int[] arr1, int[] arr2) {
        ArrayList<Integer> ans = new ArrayList<>();
        int a = 0;
        int b = 0;

        while (a < arr1.length && b < arr2.length) {
            if (arr1[a] > arr2[b]) {
                ans.add(arr2[b++]);
            } else if (arr1[a] < arr2[b]) {
                ans.add(arr1[a++]);
            } else if (arr1[a] == arr2[b]) {
                ans.add(arr1[a++]);
                ans.add(arr2[b++]);
            }
        }

        while (a < arr1.length) {
            ans.add(arr1[a++]);
        }

        while (b < arr2.length) {
            ans.add(arr2[b++]);
        }
        return ans;
    }
}
