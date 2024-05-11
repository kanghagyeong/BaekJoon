import java.util.Scanner;

public class Quiz2588 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();

        int num3 = A * ((B % 100) % 10);
        int num4 = A * ((B % 100) / 10);
        int num5 = A * (B / 100);
        int num6 = A * B;

        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        input.close();
    }
}
