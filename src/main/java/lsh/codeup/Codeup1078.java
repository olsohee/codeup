package lsh.codeup;

import java.util.Scanner;

public class Codeup1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int result = 0;

        for(int i = 2; i <= input; i += 2) {
            result += i;
        }

        System.out.println(result);
    }
}
