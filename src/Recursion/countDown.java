static void countDown(int n) {
    if (n == 0) return;
    System.out.print(n + " ");
    countDown(n - 1);
}