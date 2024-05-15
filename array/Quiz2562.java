package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] a = new int[9];
        int max = a[0];

        for (int i = 0; i < 9; i++) {
            a[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, a[i]);
        }
        System.out.println(max);
        int index = 0;
        for (int i = 0; i < 9; i++) {
            if (a[i] == max) {
                index = i;
                System.out.println(index + 1);
            }
        }
        br.close();

    }
}
