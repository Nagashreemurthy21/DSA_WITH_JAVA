public class FibonacciIterative {
    public static void main(String[] args) {
        int n = 5, a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
