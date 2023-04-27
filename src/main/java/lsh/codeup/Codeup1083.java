package lsh.codeup;

import java.util.Scanner;

public class Codeup1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for(int i = 1; i <= input; i++) {
            if(i % 3 == 0) {
                System.out.print("X ");
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
