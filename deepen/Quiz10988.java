package deepen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz10988 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        sb.append(str);
        String s = sb.reverse().toString();

        if (s.equals(str)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        br.close();

    }
}
