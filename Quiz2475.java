import java.io.*;
import java.util.StringTokenizer;

public class Quiz2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int result = 0;
        for (int i = 0; i < 5; i++) {
            int n = Integer.parseInt(st.nextToken());
            int a = (int) Math.pow(n,2);
            result += a;
        }
        result = result % 10;
        bw.write(String.valueOf(result));
        bw.flush();

        br.close();
        bw.close();

    }
}
