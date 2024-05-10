import java.io.*;
import java.util.StringTokenizer;

public class Quiz10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int[] num = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        int V = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (num[i] == V) {
                count++;
            }
        }
        bw.write(count + "\n");
        bw.flush();
        br.close();
        bw.close();

    }
}
