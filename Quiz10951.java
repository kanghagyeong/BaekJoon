import java.util.Scanner;

public class Quiz10951 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            int A = input.nextInt();
            int B = input.nextInt();
            int result = A + B;
            System.out.println(result);
        }
        input.close();
    }
}
