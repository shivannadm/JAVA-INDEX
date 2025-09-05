class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (k >= n) {
                break;
            }
            temp[k] = arr[i];
            k++;
            if (arr[i] == 0) {
                if (k >= n) {
                    break;
                }
                temp[k] = 0;
                k++;
            }
        }
        // Copy back to original array
        System.arraycopy(temp, 0, arr, 0, n);
    }
}
