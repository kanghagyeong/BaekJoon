package deepen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String s = str.toLowerCase();
        char[] chars = s.toCharArray();


        int[] alphabet = new int[26];

        for (int i = 0; i < chars.length; i++) {
            alphabet[chars[i] - 'a']++;
        }

        int M = 0;
        char ans = '?';
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] > M) {
                M = alphabet[i];
                ans = (char) (i + 'a');
            } else if (alphabet[i] == M) {
                ans = '?';
            }

        }
        System.out.println(Character.toUpperCase(ans));


    }
}
