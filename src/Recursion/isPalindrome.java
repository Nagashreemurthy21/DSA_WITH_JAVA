static boolean isPalindrome(int n, int rev) {
    if (n == 0) return true;
    if (n % 10 != rev % 10) return false;
    return isPalindrome(n / 10, rev / 10);
}