import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Quiz1158 {
    public static void main(String[] args) throws IOException {

        Queue<Integer> queue = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int count = 0;

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            count++;

            if (count == k) {
                int result = queue.poll();
                sb.append(result + ", ");
                count = 0;
            } else {
                int a = queue.poll();
                queue.add(a);
            }

        }
        sb.deleteCharAt(sb.length() - 1);
        sb.deleteCharAt(sb.length() - 1);

        System.out.println("<" + sb + ">");
        br.close();

    }
}
