import java.util.Scanner;

public class Quiz2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if ('a' <= arr[i] && arr[i] <= 'z') {
                arr[i] = (char) (arr[i] - 32);
            } else {
                arr[i] = (char) (arr[i] + 32);
            }

        }

        System.out.println(arr);
        sc.close();
    }
}
