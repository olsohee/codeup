package lsh.codeup;

import java.util.Scanner;

public class Codeup1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] arr = input.split("[-]");
        System.out.println(arr[0] + arr[1]);
    }
}
