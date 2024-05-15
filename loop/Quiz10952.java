package loop;

import java.util.Scanner;

public class Quiz10952 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int A = input.nextInt();
            int B = input.nextInt();
            if (A == 0 && B == 0) {
                break;
            }
            int result = A + B;
            System.out.println(result);
        }
        input.close();
    }
}
