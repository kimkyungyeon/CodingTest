package problem.class2;

import java.util.Arrays;
import java.util.Scanner;

//나이순정렬
public class B10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] arr = new Person[n];
        for (int i = 0; i < n; i++) {
            Person p = new Person();
            p.age = sc.nextInt();
            p.name = sc.nextLine();
            arr[i] = p;
        }

        Arrays.sort(arr);
        for (Person x : arr) {
            System.out.println(x.age +""+ x.name);
        }
    }
}

class Person implements Comparable<Person>{
    int age;
    String name;

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }
}
