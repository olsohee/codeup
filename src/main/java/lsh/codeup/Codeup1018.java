package lsh.codeup;

import java.util.Scanner;

public class Codeup1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = input.split(":");
        System.out.println(arr[0] + ":" + arr[1]);
    }
}
