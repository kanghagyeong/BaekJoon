import java.util.Scanner;

public class Quiz10430 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();

        int result = (A + B) % C;
        int result1 = ((A % C) + (B % C)) % C;
        int result2 = (A * B) % C;
        int result3 = ((A % C) * (B % C)) % C;

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}
