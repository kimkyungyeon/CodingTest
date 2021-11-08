package problem.chapter06;

import java.util.Arrays;
import java.util.Scanner;

public class Q6_07_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Point[] arr = new Point[N];
        for (int i = 0; i < N; i++) {
            arr[i] = new Point();
            arr[i].x = sc.nextInt();
            arr[i].y = sc.nextInt();
        }

        Arrays.sort(arr);
        for (Point x : arr) {
            System.out.println(x.x+" "+ x.y);
        }
    }
}

class Point implements Comparable<Point>{
    int x;
    int y;

    @Override
    public int compareTo(Point o) {
        if (o.x == this.x) {
            return this.y - o.y;
        }
        return this.x - o.x;
    }
}

