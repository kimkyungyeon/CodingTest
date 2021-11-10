package problem.class2;

import java.util.Scanner;

//최소공약수와 최소공배수
public class B2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int min = Math.min(n, m);
        int max = Math.max(n, m);
//        int y = 0;
//        for (int i = min; i >= 1; i--) {
//            if (n % i == 0 && m % i == 0) {
//                y = i;
//                break;
//            }
//        }
        while (min != 0) {
            int r = max % min;
            max = min;
            min = r;
        }
        System.out.println(max);

        System.out.println((n * m) / max);
    }
}
