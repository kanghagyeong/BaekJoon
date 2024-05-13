import java.io.*;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Quiz25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int total = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int result = a * b;
            total += result;
        }
        if (total == X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        br.close();
    }
}
