package deepen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int king = 1;
        int queen = 1;
        int rook = 2;
        int bishop = 2;
        int knight = 2;
        int pawn = 8;

        st = new StringTokenizer(br.readLine());
        int K = king - Integer.parseInt(st.nextToken());
        int Q = queen - Integer.parseInt(st.nextToken());
        int R = rook - Integer.parseInt(st.nextToken());
        int B = bishop - Integer.parseInt(st.nextToken());
        int KN = knight - Integer.parseInt(st.nextToken());
        int PAWN = pawn - Integer.parseInt(st.nextToken());

        System.out.println(K + " " + Q + " " + R + " " + B + " " + KN + " " + PAWN);
        br.close();
    }
}
