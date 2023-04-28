package lsh.codeup;

import java.util.Scanner;

public class Codeup1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        long result = a;
        for(int i = 2; i <= n; i++) {
            result = result * m + d;
        }
        System.out.println(result);
    }
}
