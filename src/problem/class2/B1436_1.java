package problem.class2;

import java.util.Scanner;

public class B1436_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = 666;
        int count = 1;
        while (n != count) {
            number++;
            if (String.valueOf(number).contains("666")) {
                count++;
            }
        }

        System.out.println(number);
    }
}
