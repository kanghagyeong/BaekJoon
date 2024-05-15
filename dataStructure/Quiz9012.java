package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Quiz9012 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        int num = Integer.parseInt(n);
        int flag = 0;

        for (int i = 0; i < num; i++) {
            String st = br.readLine();
            char[] word = st.toCharArray();
            Stack<Character> stack = new Stack<>();
            flag = 1;

            for (int j = 0; j < word.length; j++) {
                if (word[j] == '(') {
                    stack.push(word[j]);
                } else if (word[j] == ')') {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    } else {
                        System.out.println("NO");
                        flag = 0;
                        break;
                    }
                }
            }
            if (flag == 0) {
                continue;
            }
            if (stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
        br.close();

    }

}
