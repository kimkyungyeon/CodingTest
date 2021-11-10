package problem.class2;

import java.util.Scanner;

//부녀회장이될테야 - 수학
public class B2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            int[][] arr = new int[k+1][15];
            for (int j = 1; j < 15; j++) {
                arr[0][j] = j;
            }
            int cnt = 1;
            while (cnt <= k) {
                for (int j = 1; j < 15; j++) {
                    for (int l = j; l >= 1; l--) {
                        arr[cnt][j] += arr[cnt - 1][l];
                    }
                }
                cnt++;
            }


//            for (int j = 0; j <= k; j++) {
//                for (int l = 0; l < 15; l++) {
//                    System.out.print(arr[j][l]+" ");
//                }
//                System.out.println();
//            }
            System.out.println(arr[k][n]);

        }
    }
}
