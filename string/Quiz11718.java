package string;

import java.util.Scanner;

public class Quiz11718 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line;
        while ( sc.hasNextLine()) {
            line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();
    }
}
