import java.util.Scanner;

public class timus_ {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] weights = new int[n];
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            weights[i] = in.nextInt();
            totalSum += weights[i];
        }

        int minRaznost = totalSum; // максимальная возможная разность

        // Перебираем все подмножества (битовые маски)
        int totalMasks = 1 << n; // 2^n
        for (int mask = 0; mask < totalMasks; mask++) {
            int subsetSum = 0;
            // Вычисляем сумму для текущей маски
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    subsetSum += weights[i];
                }
            }
            int diff = Math.abs(totalSum - 2 * subsetSum);
            if (diff < minRaznost) {
                minRaznost = diff;
            }
        }

        System.out.println(minRaznost);
        in.close();
    }
}