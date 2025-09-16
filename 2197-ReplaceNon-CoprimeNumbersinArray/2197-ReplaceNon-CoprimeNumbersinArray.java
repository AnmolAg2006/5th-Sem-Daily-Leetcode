// Last updated: 9/16/2025, 9:39:45 PM
class Solution {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer> st = new Stack<>();
        for (int num : nums) {
            int curr = num;
            while (!st.isEmpty() && gcd(st.peek(), curr) > 1) {
                curr = (int)((long)curr * st.peek() / gcd(st.peek(), curr)); // LCM
                st.pop();
            }
            st.push(curr);
        }
        return new ArrayList<>(st);
    }
}
