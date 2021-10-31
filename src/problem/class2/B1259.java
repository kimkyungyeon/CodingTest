package problem.class2;

import java.util.Scanner;

public class B1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String n = sc.nextLine();
            if(n.equals("0")) break;
            String x = new StringBuilder(n).reverse().toString();
            if (n.equals(x)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }
    }
}
