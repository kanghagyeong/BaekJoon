package loop;

import java.util.Scanner;

public class Quiz2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i < 10; i++) {
            int result = n * i ;
            System.out.println(n + " * " + i + " = " + result);
        }
        sc.close();
    }
}
