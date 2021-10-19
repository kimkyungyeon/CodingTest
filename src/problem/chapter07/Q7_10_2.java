package problem.chapter07;

import java.util.LinkedList;
import java.util.Queue;

//tree 말단 노드까지의 가장 짧은 경로
public class Q7_10_2 {
    Node root;

    public static void main(String[] args) {
        Q7_10_2 tree = new Q7_10_2();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.bfs(tree.root));
    }

    public int bfs(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int l = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                Node x = q.poll();

                if (x.lt == null && x.rt == null) {
                    return l;
                }

                if (x.lt != null) {
                    q.offer(x.lt);
                }
                if (x.rt != null) {
                    q.offer(x.rt);
                }
            }
            l++;
        }
        return -1;
    }

}
