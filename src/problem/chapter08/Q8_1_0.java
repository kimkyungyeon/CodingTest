package problem.chapter08;

import java.util.Arrays;
import java.util.Scanner;

//합이 같은 부분집합(dfs: 아마존 인터뷰)
public class Q8_1_0 {
    static String answer = "NO";
    static int n;
    static boolean flag = false;
    static int total;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }


        dfs(0, 0, arr);
        System.out.println(answer);
    }

    public static void dfs(int l, int sum, int[] arr) {
        if(flag) return;
        if(sum>total/2) return;
        if (l == n) {
            if ((total - sum) == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            dfs(l + 1, sum + arr[l], arr);
            dfs(l + 1, sum, arr);
        }
    }

}