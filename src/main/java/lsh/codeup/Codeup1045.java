package lsh.codeup;

import java.util.Scanner;

public class Codeup1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max, min;
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 > num2) {
            max = num1; min = num2;
        } else {
            max = num2; min = num1;
        }

        System.out.println(max + min);
        System.out.println(max - min);
        System.out.println(max * min);
        System.out.println(max / min);
        System.out.println(max % min);
        System.out.printf("%.2f", (double)max / min);
    }
}
