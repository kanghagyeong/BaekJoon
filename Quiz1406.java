import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Quiz1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        String n = br.readLine();
        int num = Integer.parseInt(n);

        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            stack.push(ch[i]);
        }

        for (int i = 0; i < num; i++) {
            String cmd = br.readLine();
            String[] cmds = cmd.split(" ");

            if (cmd.equals("L")) {
                if (stack.isEmpty()) {
                    continue;
                }
                char a = stack.pop();
                stack2.push(a);
               
            } else if (cmd.equals("D")) {
                if (stack2.isEmpty()) {
                    continue;
                }
                char a = stack2.pop();
                stack.push(a);
            } else if (cmd.equals("B")) {
                if (stack.isEmpty()) {
                    continue;
                }
                stack.pop();
            } else if (cmds[0].equals("P")) {
                stack.push(cmds[1].charAt(0));
            }
        }

        while (!stack.isEmpty()) {
            char a = stack.pop();
            stack2.push(a);
        }

        while (!stack2.isEmpty()) {
            char a = stack2.pop();
            sb.append(a);
        }
        System.out.print(sb.toString());
        

    }
}
