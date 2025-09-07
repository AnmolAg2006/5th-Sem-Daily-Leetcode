// Last updated: 9/7/2025, 11:26:58 AM
class Solution {
    public int[] sumZero(int n) {
        int arr[] = new int[n];
        int j = 0;
        if (n % 2 != 0) {
            for (int i = -n / 2; i <= n / 2; i++) {
                arr[j++] = i;
            }
        } else {
            for (int i = -n/2 ; i <= n/2 ; i++) {
                if(i==0) continue;
                arr[j++] = i;
            }
        }
        return arr;
    }
}