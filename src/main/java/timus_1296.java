import java.util.Scanner;

public class timus_1296 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int currentSum = 0;
        int maxSum = 0;

        for (int i = 0; i < n; i++) {
            int p = in.nextInt();
            currentSum = Math.max(0, currentSum + p);
            maxSum = Math.max(maxSum, currentSum);
        }
        in.close();
        System.out.println(maxSum);
    }
}