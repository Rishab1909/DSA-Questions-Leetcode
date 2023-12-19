class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] arr = new int[n];
        int ans = 0;

        if (k == 0)
            return arr;

        else if (k > 0) {
            for (int i = 0; i < n; i++) {
                ans = 0;
                for (int j = 0; j < k; j++) {
                    ans += code[(i + j + 1) % n];
                }

                arr[i] = ans;
            }
        } else {
            for (int i = 0; i < n; i++) {
                ans = 0;
                for (int j = k; j < 0; j++) {
                    ans += code[(i + j + n) % n];
                }
                arr[i] = ans;
            }
        }
        return arr;

    }
}