import java.io.*;
import java.util.StringTokenizer;

public class Quiz2480 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if ((a == b) && (b == c)) {
            int money = 10000 + a * 1000;
            sb.append(money);
        } else if(!(a == b) && (b == c)) {
            int money = 1000 + b * 100;
            sb.append(money);
        } else if(!(a == c) && (b == a)) {
            int money = 1000 + a * 100;
            sb.append(money);
        } else if(!(b == c) && (c == a)) {
            int money = 1000 + c * 100;
            sb.append(money);
        } else if ((a != b) && (b != c) && (c != a)) {
            if ((a > b) && (a > c)) {
                int money = a * 100;
                sb.append(money);
            } else if ((b > a) && (b > c)) {
                int money = b * 100;
                sb.append(money);
            } else if ((c > a) && (c > b)) {
                int money = c * 100;
                sb.append(money);
            }
        }
        System.out.println(sb);
        bw.close();
        br.close();
    }
}
