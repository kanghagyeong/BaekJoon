import java.util.Scanner;

public class Quiz10872 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int result = 1;
        
        for (int i = 1; i <= n; i++) {
            result = result * i ;
        }

        System.out.println(result);
    }
}
