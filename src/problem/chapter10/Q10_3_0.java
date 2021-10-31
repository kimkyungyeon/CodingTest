package problem.chapter10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q10_3_0 {
    static int n;
    static int[] arr;
    static ArrayList<Friend> fs;
    static int cnt = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        fs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            fs.add(new Friend(sc.nextInt(), 's'));
            fs.add(new Friend(sc.nextInt(), 'e'));
        }

        Collections.sort(fs);

        int answer = 0;
        int cnt = 0;
        for (Friend x : fs) {
            if (x.state == 's') {
                cnt++;
            } else {
                cnt--;
            }
            answer = Math.max(cnt, answer);
        }

        System.out.println(answer);
    }
}

class Friend implements Comparable<Friend> {
    int time;
    char state;


    public Friend(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Friend o) {
        if (this.time == o.time) {
            return this.state - o.state;
        } else {
            return this.time - o.time;
        }
    }
}
