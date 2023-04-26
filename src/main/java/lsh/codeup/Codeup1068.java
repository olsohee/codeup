package lsh.codeup;

import java.util.Scanner;

public class Codeup1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        char grade;

        if(input >= 90) grade = 'A';
        else if(input >= 70) grade = 'B';
        else if(input >= 40) grade = 'C';
        else grade = 'D';

        System.out.println(grade);
    }
}
