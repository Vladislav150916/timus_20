import java.util.Scanner;

public class timus_2025 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int test = 0; test < T; test++) {
            int n = in.nextInt();
            int k = in.nextInt();

            long q = n / k;
            long r = n % k;

            long totalPairs = (long) n * (n - 1) / 2;
            long intraPairs = r * (q + 1) * q / 2 + (k - r) * q * (q - 1) / 2;
            long answer = totalPairs - intraPairs;

            System.out.println(answer);
        }
        in.close();
    }
}