package problem.chapter07;

//tree 말단 노드까지의 가장 짧은 경로
public class Q7_09_2 {
    Node root;

    public static void main(String[] args) {
        Q7_09_2 tree = new Q7_09_2();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.dfs(0, tree.root));


    }

    public int dfs(int L, Node root){
        if (root.lt == null && root.rt == null) {
            return L;
        } else {
            return Math.min(dfs(L + 1, root.lt), dfs(L + 1, root.rt));
        }


    }
}
