package io;

import java.util.Scanner;

public class Quiz1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int result = A - B;
        System.out.println(result);
        sc.close();
    }
}
