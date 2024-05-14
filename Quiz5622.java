import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int sec = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A' || c == 'B' || c == 'C') {
                sec += 3;
            } else if (c == 'D' || c == 'E' || c == 'F') {
                sec += 4;
            } else if (c == 'G' || c == 'H' || c == 'I') {
                sec += 5;
            } else if (c == 'J' || c == 'K' || c == 'L') {
                sec += 6;
            } else if (c == 'M' || c == 'N' || c == 'O') {
                sec += 7;
            } else if (c == 'P' || c == 'Q' || c == 'R' || c == 'S') {
                sec += 8;
            } else if (c == 'T' || c == 'U' || c == 'V') {
                sec += 9;
            } else if (c == 'W' || c == 'X' || c == 'Y' || c == 'Z') {
                sec += 10;
            }
        }
        System.out.println(sec);
    }
}
