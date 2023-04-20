package lsh.codeup;

import java.util.Scanner;

public class Codeup1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] arr = input.split("");
        for(int i = 0; i < arr.length; i++) {
            System.out.println("'" + arr[i] + "'");
        }
    }
}
