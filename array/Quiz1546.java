package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        double M = 0;
        double sum = 0;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(st.nextToken());
            arr[i] = a;
            M = Math.max(arr[i], M);
        }
        for (int i = 0; i < N; i++) {
            sum += arr[i] / M * 100;
        }

        double avg = sum / N;
        System.out.println(avg);
        br.close();

    }
}
