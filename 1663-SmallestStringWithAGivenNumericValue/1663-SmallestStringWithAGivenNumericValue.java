// Last updated: 11/9/2025, 12:15:27 AM
class Solution {
    public String getSmallestString(int n, int k) {
        char[] res = new char[n];
        Arrays.fill(res, 'a');
        k -= n; // because all are 'a' initially (value 1 each)

        int i = n - 1;
        while (k > 0) {
            int add = Math.min(25, k); // max we can add to make 'z'
            res[i] = (char) (res[i] + add);
            k -= add;
            i--;
        }

        return new String(res);
    }
}
