package lsh.codeup;

import java.util.Scanner;

public class Codeup1095 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int min = 24;
        int[] arr = new int[sc.nextInt()];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] < min) min = arr[i];
        }

        System.out.println(min);
    }
}
