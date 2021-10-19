package problem.chapter07;

import java.util.LinkedList;
import java.util.Queue;

public class Q7_07_2 {
    Node root;

    public static void main(String[] args) {
        Q7_07_2 tree = new Q7_07_2();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.bfs(tree.root);
    }

    private void bfs(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int l = 0;

        while (!q.isEmpty()) {
            int len = q.size();
            System.out.print(l + " : ");
            for (int i = 0; i < len; i++) {
                Node cur = q.poll();

                System.out.print(cur.data +" ");

                if (cur.lt != null) {
                    q.offer(cur.lt);
                }
                if (cur.rt != null) {
                    q.offer(cur.rt);
                }
            }
            l++;
            System.out.println();
        }
    }


}
