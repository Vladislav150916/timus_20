import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int test = 0; test < T; test++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            long q = n / k;          // размер меньшей команды
            long r = n % k;          // количество команд размера q+1

            long totalPairs = (long) n * (n - 1) / 2;
            long intraPairs = r * (q + 1) * q / 2 + (k - r) * q * (q - 1) / 2;
            long answer = totalPairs - intraPairs;

            System.out.println(answer);
        }
        scanner.close();
    }
}