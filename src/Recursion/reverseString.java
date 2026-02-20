static void reverse(String str) {
    if (str == null || str.length() <= 1) {
        System.out.print(str);
        return;
    }
    System.out.print(str.charAt(str.length() - 1));
    reverse(str.substring(0, str.length() - 1));
}