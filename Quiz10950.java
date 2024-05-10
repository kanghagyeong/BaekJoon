import java.util.Scanner;

public class Quiz10950 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();


        while (n-- > 0) {
            int A = input.nextInt();
            int B = input.nextInt();
            int result = A + B;
            System.out.println(result);
        }
        input.close();
    }
}
