import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Quiz10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int[] num = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        for (int n : num) {

            if (n < X) {

               bw.write(n + " ");
            }
        }
        bw.flush();
        br.close();
        bw.close();

    }
}
