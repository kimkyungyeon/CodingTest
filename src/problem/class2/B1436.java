package problem.class2;

import java.util.Scanner;

public class B1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int number = 666;
        while (n != count) {
            number++;
            if (String.valueOf(number).contains("666")) {
                count++;
            }
        }

        System.out.println(number);

    }
}
