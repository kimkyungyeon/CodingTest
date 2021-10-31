package problem.chapter09;

import java.util.*;

public class Q9_4_0 {
    static int[] dy;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dy = new int[n];
        ArrayList<Block> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new Block(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }


        System.out.println(solution(arr));
    }

    private static int solution(ArrayList<Block> arr) {
        int answer = 0;
        Collections.sort(arr);
        dy[0] = arr.get(0).h;
        answer = dy[0];
        for (int i = 1; i < arr.size(); i++) {
            int sum = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr.get(i).w < arr.get(j).w && dy[j] > sum) {

                    sum = dy[j];
                }
            }
            dy[i] = sum + arr.get(i).h;
            answer = Math.max(answer, dy[i]);
        }
        return answer;
    }
}


class Block implements Comparable<Block> {
    int s;
    int h;
    int w;

    public Block(int s, int h, int w) {
        this.s = s;
        this.h = h;
        this.w = w;
    }


    @Override
    public int compareTo(Block o) {
        return o.s - this.s;
    }
}