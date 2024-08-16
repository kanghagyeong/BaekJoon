import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int multi = a * b * c;
        String result = String.valueOf(multi);

        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) - '0' == i) {
                    count++;
                }
            }
            System.out.println(count);
        }




    }
}
