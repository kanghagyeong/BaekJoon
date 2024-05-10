import java.util.Scanner;

public class Quiz27866 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         String str = input.nextLine();
         int N = input.nextInt();

         char a = str.charAt(N-1);
         System.out.println(a);
        input.close();

     }
}
