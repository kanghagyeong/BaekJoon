import java.io.*;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Quiz15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int result = A + B;
            bw.write(result + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
