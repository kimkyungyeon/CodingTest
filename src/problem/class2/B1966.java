package problem.class2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//프린터 큐
public class B1966 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] arr = new int[N];
            LinkedList<Text> q = new LinkedList<>();
            for (int j = 0; j < N; j++) {
                q.offer(new Text(j, sc.nextInt()));
            }

            int cnt = 0;
            while (!q.isEmpty()) {
                boolean isMax = true;
                Text front = q.poll();
                for (int j = 0; j < q.size(); j++) {
                    if (front.i < q.get(j).i) {
                        q.offer(front);

                        for (int k = 0; k < j; k++) {
                            q.offer(q.poll());
                        }
                    }
                    isMax = false;
                    break;
                }

                if (isMax == false) {
                    continue;
                }

                cnt++;
                if (front.s == M) {
                    break;
                }
            }
            System.out.println(cnt);
        }
    }
}

class Text {
    int s;
    int i;

    public Text(int s, int i) {
        this.s = s;
        this.i = i;
    }
}
