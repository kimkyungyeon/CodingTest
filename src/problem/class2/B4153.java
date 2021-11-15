package problem.class2;

import java.util.Scanner;

public class B4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            int x = sc.nextInt();

            if (w == 0 && h == 0 && x == 0) {
                break;
            }

            if (x == Math.sqrt(Math.pow(h, 2) + Math.pow(w, 2))) {
                System.out.println("right");
            } else if (h == Math.sqrt(Math.pow(x, 2) + Math.pow(w, 2))) {
                System.out.println("right");
            } else if (w == Math.sqrt(Math.pow(h, 2) + Math.pow(x, 2))) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }

        }
    }
}
