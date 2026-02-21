static boolean isSorted(int[] arr, int idx) {
    if (idx == arr.length - 1) return true;
    if (arr[idx] > arr[idx + 1]) return false;
    return isSorted(arr, idx + 1);
}