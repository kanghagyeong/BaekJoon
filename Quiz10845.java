import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Quiz10845 {
    public static void main(String[] args) throws IOException {

        Queue<Integer> queue = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int last = 0;

        String N = br.readLine();
        int n = Integer.parseInt(N);

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            switch (str) {
                case "push" :
                    last = Integer.parseInt(st.nextToken());
                    queue.add(last);
                    break;

                case "pop" :
                    if (queue.isEmpty()) {
                        sb.append(-1).append("\n"); // append(-1) : 실패 / append(1) : true / append(0) : false
                    } else {
                        sb.append(queue.poll()).append("\n");
                    }
                    break;

                case "size" :
                    sb.append(queue.size()).append("\n");
                    break;

                case "empty" :
                    if (queue.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;

                case "front" :
                    if (queue.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(queue.peek()).append("\n");
                    }
                    break;

                case "back" :
                    if (queue.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(last).append("\n");
                        break;
                    }

            }

        }
        System.out.println(sb);
        br.close();

    }
}
