package problem.chapter10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q10_1_0 {
    static int n;
    static ArrayList<Person> arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new ArrayList<>();
//        arr.add(null);
        for (int i = 0; i < n; i++) {
            arr.add(new Person(sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(arr);
        int answer =0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {

            if (max < arr.get(i).y) {
                max = arr.get(i).y;
                answer++;
            }

        }
        System.out.println(answer);

    }
}

class Person implements Comparable<Person> {
    int x;
    int y;

    public Person(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Person o) {
        return o.x- this.x;
    }
}
