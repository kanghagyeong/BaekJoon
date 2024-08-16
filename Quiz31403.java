import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz31403 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int result = a + b - c;
        System.out.println(result);

        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        String s3 = s1 + s2;
        System.out.println(Integer.parseInt(s3) - c);

    }
}
