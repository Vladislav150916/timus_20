import java.util.Scanner;
import java.util.Stack;

public class timus_1494 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] out = new int[n];
        for (int i = 0; i < n; i++) {
            out[i] = in.nextInt();
        }
        in.close();

        Stack<Integer> stack = new Stack<>();
        int current = 1;

        for (int x : out) {
            if (!stack.isEmpty() && stack.peek() == x) {
                stack.pop();
            } else {
                while (current <= n && current != x) {
                    stack.push(current);
                    current++;
                }
                if (current > n) {
                    System.out.println("Cheater");
                    return;
                }
                current++;
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Not a proof");
        } else {
            System.out.println("Cheater");
        }
    }
}