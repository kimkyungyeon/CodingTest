package problem.class2;

import java.util.Scanner;

//ACM호텔
public class B10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            int count = 0;

            int[][] arr = new int[H+1][W+1];
            for (int j = 1; j <= W ; j++) {
                for (int k = 1; k <= H ; k++) {
                    count++;
                    if (count == N) {
                        String str = "";
                        if (j < 10) {
                            str = str + k + "0" + j;
                        } else {
                            str = str + k + j;
                        }
                        System.out.println(str);

                    }
                }
            }
        }
    }
}
