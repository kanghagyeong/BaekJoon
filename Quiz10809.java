import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        String[] s = S.split("");
        char[] c = S.toCharArray();
        int[] alpha = new int[26];

        for (int i = 0; i < alpha.length; i++) {
            alpha[i] = -1;
        }

        for (int i = 0; i < s.length; i++){
            if (alpha[c[i] - 97] == -1) {
                alpha[ c[i] - 97 ] = i;
            }
        }

        for (int i = 0; i < alpha.length; i++) {
            System.out.print(alpha[i] + " ");
        }
        br.close();
    }
}