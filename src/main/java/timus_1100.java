import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();


        ArrayList<Integer>[] arrList = new ArrayList[101];
        for (int i = 0; i <= 100; i++) {
            arrList[i] = new ArrayList<>();
        }

        for (int i = 0; i < N; i++) {
            int ID = in.nextInt();
            int M = in.nextInt();
            arrList[M].add(ID);
        }

        StringBuilder sb = new StringBuilder();
        for (int m = 100; m >= 0; m--) {
            for (int id : arrList[m]) {
                String str = id + " " + m + "\n";
                sb.append(str);
            }
        }
        in.close();
        System.out.print(sb);
    }
}