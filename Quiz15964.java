import java.io.*;
import java.util.StringTokenizer;

public class Quiz15964 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        long result = solve(A, B);
        bw.write(Long.toString(result));
        bw.flush();

        br.close();
        bw.close();
    }

    private static long solve(long A,long B) {
        return (A + B) * (A - B);
    }

}
