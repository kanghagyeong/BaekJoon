import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Quiz9093a { // 스택 사용하여 풀어서 메모리 초과 하지만 결과는 잘 나옴  - 수정 완료 
    public static void main(String[] args) throws IOException {
        Stack<Character> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String n = br.readLine();
        int a = Integer.parseInt(n);

        for (int i = 0; i < a; i++) {
            String n1 = br.readLine();
            String[] st = n1.split(" ");

            for (int j = 0; j < st.length; j++) {
                
                for (Character c : st[j].toCharArray()) {
                    stack.push(c); 
                }
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(" ");
            }
            
            System.out.println(sb.toString());
            sb.setLength(0);
        }

    }
}
