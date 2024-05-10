import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Quiz10828 {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();
        int n = Integer.parseInt(N);

        for (int i = 0; i < n; i++) {
            String command = br.readLine();
            String[] a = command.split(" ");

            if (a[0].equals("push")) {
                
                stack.push(Integer.parseInt(a[1]));
            } else if (a[0].equals("pop")) {
                if (stack.empty()) {
                    System.out.println("-1");
                } else {
                    int p = stack.pop();
                    System.out.println(p);
                }
            } else if (a[0].equals("size")) {
                int s = stack.size();
                System.out.println(s);
            } else if (a[0].equals("empty")) {
                if (stack.empty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if (a[0].equals("top")) {
                
                if (stack.empty()) {
                    System.out.println("-1");
                } else {
                    int f = stack.peek();
                    System.out.println(f);
                }
            }
        }
        br.close();
    }
}