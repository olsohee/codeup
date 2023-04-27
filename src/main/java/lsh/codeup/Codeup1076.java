package lsh.codeup;

import java.util.Scanner;

public class Codeup1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        char temp = 'a';
        while(temp <= input) {
            System.out.print(temp + " ");
            temp++;
        }
    }
}
