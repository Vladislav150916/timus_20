import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class timus_1723 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Map<String, Integer> spells = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String sub = str.substring(i, j);
                spells.put(sub, spells.getOrDefault(sub, 0) + 1);
            }
        }

        String best = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> e : spells.entrySet()) {
            if (e.getValue() > maxCount) {
                maxCount = e.getValue();
                best = e.getKey();
            }
        }
        System.out.println(best);
    }
}