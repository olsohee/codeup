package lsh.codeup;

import java.util.Scanner;

public class Codeup1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] arr = input.split("");
        for(int i = 0; i < arr.length; i++) {
            System.out.print("[" + arr[i]);
            for(int j = arr.length-1; j > i; j--) {
                System.out.print("0");
            }
            System.out.println("]");
        }
    }
}
