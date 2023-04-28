package lsh.codeup;

import java.util.Scanner;

public class Codeup1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = 1;

        while(a != 0 && b != 0 && c!= 0) {

            if(result % a == 0 && result % b == 0 && result % c == 0 ) break;
            result++;
        }

        System.out.println(result);
    }
}
