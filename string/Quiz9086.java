package string;

import java.io.*;

public class Quiz9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            String a = br.readLine();
            char[] c = a.toCharArray();
            bw.write(c[0]);
            bw.write(c[c.length-1] + "\n");
        }
        bw.flush();

        br.close();
        bw.close();


    }
}
