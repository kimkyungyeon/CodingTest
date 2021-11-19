package problem.class2;

import java.util.Scanner;

public class B10250_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();


            int ho1 = 0;

            int ho = 0;
            if (N % H == 0) {
                ho = H;
                ho1 = N / H;
            } else {
                ho = N % H;
                ho1 = N / H + 1;
            }

            System.out.println(ho*100+ho1);
        }
    }
}
