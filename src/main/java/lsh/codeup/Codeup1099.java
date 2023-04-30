package lsh.codeup;

import java.util.Scanner;

public class Codeup1099 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[10][10];

        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int x = 1;
        int y = 1;

        while(true) {

            //현재 위치
            if(arr[x][y] == 0) arr[x][y] = 9;
            else if(arr[x][y] == 2) {
                arr[x][y] = 9;
                break;
            }

            //다음 위치
            //오른쪽
            if(arr[x][y + 1] == 0 || arr[x][y + 1] == 2) {
                y++;
            } else if(y + 1 > 9) {
                break;
            } else { //아래
                if(arr[x + 1][y] == 0 || arr[x + 1][y] == 2) {
                    x++;
                } else {
                    break;
                }
            }
        }

        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
