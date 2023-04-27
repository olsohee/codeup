package lsh.codeup;

import java.util.Scanner;

public class Codeup1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int result = 0;
        int i;
        for(i = 0; result < input; i++) {
            result += i;
        }
        System.out.println(--i);
    }
}
