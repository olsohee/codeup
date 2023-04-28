package lsh.codeup;

import java.util.Scanner;

public class Codeup1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sum = 0;

        for(int i = 1; input > sum; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
