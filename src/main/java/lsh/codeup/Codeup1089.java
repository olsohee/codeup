package lsh.codeup;

import java.util.Scanner;

public class Codeup1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        for(int count = 2; count <= n; count++) {
            a += d;
        }
        System.out.println(a);
    }
}
