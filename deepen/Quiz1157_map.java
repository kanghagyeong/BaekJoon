package deepen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Quiz1157_map {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String s = str.toLowerCase();


        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }


        int max = 0;
        char key = '?';
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                key = entry.getKey();
                max = entry.getValue();
            } else if (entry.getValue() == max) {
                key = '?';
            }
        }
        System.out.println(Character.toUpperCase(key));
    }
}
