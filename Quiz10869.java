import java.util.Scanner;

public class Quiz10869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int plus = A + B;
        int minus = A - B;
        int multiply = A * B;
        int divide = A / B;
        int remain = A % B;

        System.out.println(plus);
        System.out.println(minus);
        System.out.println(multiply);
        System.out.println(divide);
        System.out.println(remain);
        sc.close();
    }
}
