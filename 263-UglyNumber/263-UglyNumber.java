// Last updated: 8/23/2025, 10:29:21 PM
class Solution {
    public boolean isUgly(int n) {
        if (n < 1){
            return false;
        }

        while (n > 1) {
            if (n % 2 == 0){
                n /= 2;
            } else if (n % 3 == 0){
                n /= 3;
            } else if (n % 5 == 0){
                n /= 5;
            } else {
                return false;
            }
        }

        return true;
    }
}