package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        sb.append(n);
        int first = Integer.parseInt(sb.reverse().toString());
        sb.setLength(0);

        sb.append(m);
        int second = Integer.parseInt(sb.reverse().toString());

        if (first > second) {
            System.out.println(first);
        } else {
            System.out.println(second);
        }

        br.close();


    }
}
