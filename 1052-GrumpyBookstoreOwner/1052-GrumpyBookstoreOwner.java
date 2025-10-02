// Last updated: 10/2/2025, 5:19:25 PM
class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = grumpy.length;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) {
                temp += customers[i];

            }
        }
        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                temp += customers[i];
            }
        }

        int ans = temp;
        for (int i = minutes; i < n; i++) {
            if (grumpy[i - minutes] == 1) {
                temp -= customers[i - minutes];
            }
            if (grumpy[i] == 1) {
                temp += customers[i];
            }
            // temp += customers[i];

            ans = Math.max(ans, temp);
        }
        return ans;
    }
}