package deepen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int length = str.length();
        int count = 0;

        for (int i = 0; i < length; i++) {
            if (str.contains("c=")) {
                count++;
                str.charAt(i + 1);
            }
        }


    }
}
