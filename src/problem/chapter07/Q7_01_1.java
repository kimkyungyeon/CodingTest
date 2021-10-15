package problem.chapter07;

public class Q7_01_1 {
    public static void main(String[] args) {
        DFS(3);
    }

    private static void DFS(int i) {
        if (i == 0) {
            return;
        }
        DFS(i - 1);
        System.out.print(i + " ");
    }
}
