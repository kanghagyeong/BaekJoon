import java.util.Scanner;

public class Quiz2438 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("*".repeat(i));
        }
        input.close();
    }
}
