package problem.chapter09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q9_4_1 {
    static int[] dy;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dy = new int[n];
        ArrayList<Brick> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new Brick(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }


        System.out.println(solution(arr));

        for (int x : dy) {
            System.out.print(x+" ");
        }
    }

    private static int solution(ArrayList<Brick> arr) {
        Collections.sort(arr);
        dy[0] = arr.get(0).h;
        int answer = arr.get(0).h;
        for (int i = 1; i < arr.size(); i++) {
            int total = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr.get(i).w < arr.get(j).w && dy[j]>total) {
                    total = dy[j];
                }
            }
                dy[i] = total + arr.get(i).h;
                answer = Math.max(answer, dy[i]);
        }
        return answer;

    }
}

class Brick implements Comparable<Brick> {
    int s;
    int h;
    int w;

    public Brick(int s, int h, int w) {
        this.s = s;
        this.h = h;
        this.w = w;
    }


    @Override
    public int compareTo(Brick o) {
        return o.s-this.s;
    }
}