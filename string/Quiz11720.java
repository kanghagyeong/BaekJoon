package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split("");

        int sum = 0;
        for (int i = 0; i < N; i++) {
           sum += Integer.parseInt(arr[i]);
        }
        System.out.println(sum);
        br.close();

    }
}
