import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz9093 { // 이것도,, 메모리 초과 하지만 결과는 잘 나옴 ,,, - 수정 완료 
    public static void main(String[] args) throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringBuilder sbr = new StringBuilder();

        String n = br.readLine();
        int a = Integer.parseInt(n);

        for (int i = 0; i < a; i++) {
            String n1 = br.readLine();
            String[] st = n1.split(" ");

            for (int j = 0; j < st.length; j++) {
              sb.append(st[j]);
              sbr.append(sb.reverse().toString());
              sb.setLength(0);
              sbr.append(" ");
            }
            
            System.out.println(sbr.toString());
            sbr.setLength(0);
        }

    }
}
