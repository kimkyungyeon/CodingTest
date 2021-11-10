package problem.class2;

import java.util.Arrays;
import java.util.Scanner;

//통계학
public class B2108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] ch = new int[8001];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        //평균
        float avg = 0;
        for (int x : arr) {
            avg += (float) x;
        }
        System.out.println(Math.round(avg / N));

        //중앙값
        Arrays.sort(arr);
        System.out.println(arr[(N - 1) / 2]);

        //최빈값
        for (int x : arr) {
            ch[x + 4000]++;
        }
        int max = 0;
        int mode = 0;
        boolean flag = false;
        for (int i = 0; i < ch.length; i++) {
            if (max < ch[i]) {
                max = ch[i];
                mode = i - 4000;
                flag = true;
            } else if (max == ch[i] && flag == true) {
                mode = i - 4000;
                flag = false;
            }
        }
        System.out.println(mode);




        //범위
        System.out.println(arr[N - 1] - arr[0]);
    }
}
