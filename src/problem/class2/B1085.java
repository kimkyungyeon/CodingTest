package problem.class2;

import java.util.Scanner;

public class B1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        System.out.println(solution(x, y, w, h));
    }

    private static int solution(int x, int y, int w, int h) {
        int answer = Integer.MAX_VALUE;

        int min0 = Math.min(x-0, y-0);
        int min1 = Math.min(w - x, h - y);

        return Math.min(min0,min1);
    }
}
