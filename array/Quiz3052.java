package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int[] arr = new int[42];
        int result = 0;
        int count = 0;


        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());
            result = n % 42;
            arr[result]++;
        }
        for (int i = 0; i < 42; i++) {
            if (arr[i] != 0) {
                count++;
            }
        }
        System.out.println(count);
        br.close();
    }
}