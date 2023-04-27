package lsh.codeup;

import java.io.*;

public class Codeup1084 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int count = 0;

        for(int i = 0; i < Integer.parseInt(input[0]); i++) {
            for(int i2 = 0; i2 < Integer.parseInt(input[1]); i2++) {
                for(int i3 = 0; i3 < Integer.parseInt(input[2]); i3++) {
                    count++;
                    bw.write(i + " " + i2 + " " + i3 + '\n');
                }
            }
        }
        bw.write(String.valueOf(count));
        bw.close();
    }
}
