package lsh.codeup;

import java.util.Scanner;

public class Codeup1093 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] students = new int[23];

        for(int i = 0; i < n; i++) {
            students[sc.nextInt() -1]++;
        }

        for(int i = 0; i < students.length; i++) {
            System.out.print(students[i] + " ");
        }
    }
}
