package conditional;

import java.util.Scanner;

public class Quiz14681 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();

        if (A > 0 && B > 0) {
            System.out.println("1");
        } else if (A > 0 && B < 0) {
            System.out.println("4");
        } else if (A < 0 && B > 0) {
            System.out.println("2");
        } else if (A < 0 && B < 0) {
            System.out.println("3");
        }
        input.close();
    }
}
