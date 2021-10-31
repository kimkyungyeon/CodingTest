package problem.chapter10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q10_2_0 {
    static int n;
    static ArrayList<Session> arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new Session(sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(arr);
        System.out.println(solution(arr));
    }

    private static int solution(ArrayList<Session> arr) {
        int ans = 0;
        int et =0;
        for (Session x : arr) {
            if (x.st >= et) {
                et = x.ft;
                ans++;
            }
        }
        return ans;
    }
}

class Session implements Comparable<Session> {
    int st;
    int ft;

    public Session(int st, int ft) {
        this.st = st;
        this.ft = ft;
    }

    @Override
    public int compareTo(Session o) {
        if (this.ft == o.ft) {
            return this.st - o.st;
        } else {
            return this.ft - o.ft;
        }
    }
}