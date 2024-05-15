package conditional;

import java.io.*;
import java.util.StringTokenizer;

public class Quiz2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int C = Integer.parseInt(br.readLine());

        int minute = 60 * A + B;
        minute += C;
        int hour = (minute / 60) % 24;
        int minutes = minute % 60;

        bw.write(hour + " " + minutes);
        bw.flush();
        br.close();
        bw.close();


    }
}
