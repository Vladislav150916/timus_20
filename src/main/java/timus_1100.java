import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class timus_1100 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer>[] arrList = new ArrayList[101];
        for (int i = 0; i <= 100; i++) {
            arrList[i] = new ArrayList<>();
        }

        for (int i = 0; i < N; i++) {
            String[] parts = br.readLine().split(" ");
            int ID = Integer.parseInt(parts[0]);
            int M = Integer.parseInt(parts[1]);
            arrList[M].add(ID);
        }

        StringBuilder sb = new StringBuilder();
        for (int m = 100; m >= 0; m--) {
            for (int id : arrList[m]) {
                sb.append(id).append(' ').append(m).append('\n');
            }
        }
        System.out.print(sb);
    }
}