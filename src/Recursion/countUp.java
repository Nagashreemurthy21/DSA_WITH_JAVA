static void countUp(int n) {
    if (n == 0) return;
    countUp(n - 1);
    System.out.print(n + " ");
}