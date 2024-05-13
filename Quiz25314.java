import java.util.Scanner;

public class Quiz25314 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int a = n / 4;

        for (int i = 0; i < a; i++) {
            System.out.print("long" + " ");
        }
        System.out.println("int");
    }
}
