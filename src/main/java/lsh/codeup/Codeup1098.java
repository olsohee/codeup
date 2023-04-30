package lsh.codeup;

import java.util.Scanner;

public class Codeup1098 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();

        int[][] arr = new int[h][w];

        int count = sc.nextInt();

        for (int n = 0; n < count; n++) {
            int l = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;

            if (d == 0) {
                for (int i = 0; i < l; i++) {
                    arr[x][y + i] = 1;
                }
            } else {
                for (int i = 0; i < l; i++) {
                    arr[x + i][y] = 1;
                }
            }
        }

        for(int i = 0; i < h; i++) {
            for(int j = 0; j < w; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}