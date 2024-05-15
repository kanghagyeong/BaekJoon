package array;

import java.io.*;

public class Quiz5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] num = new int[31];

        for (int i = 0; i < 28; i++) {
            num[Integer.parseInt(br.readLine())]++;
        }
        for (int i = 1; i < 31; i++) {
            if (num[i] != 1) {
                bw.write(i + "\n");
            }
        }
        bw.flush();
        br.close();
        bw.close();

    }
}
