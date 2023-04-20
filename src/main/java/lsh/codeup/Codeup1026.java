package lsh.codeup;

import java.util.Scanner;

public class Codeup1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] arr = input.split("[:]");
        int minute = Integer.parseInt(arr[1]);
        System.out.println(minute);
    }
}
