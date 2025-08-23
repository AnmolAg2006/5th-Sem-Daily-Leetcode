// Last updated: 8/23/2025, 10:29:50 PM
import java.util.Stack;

class Solution {
    public int evalRPN(String[] t) {
        Stack<Integer> s = new Stack<>();
        int ans = 0;

        for (int i = 0; i < t.length; i++) {
            if (!t[i].equals("+") && !t[i].equals("-") && !t[i].equals("/") && !t[i].equals("*")) {
                s.add(Integer.parseInt(t[i]));
            } else {
                int n1 = s.pop();
                int n2 = s.pop();
                
                if (t[i].equals("+")) {
                    ans = n2 + n1;
                } else if (t[i].equals("-")) {
                    ans = n2 - n1;
                } else if (t[i].equals("/")) {
                    ans = n2 / n1;
                } else if (t[i].equals("*")) {
                    ans = n2 * n1;
                }
                
                s.push(ans);
            }
        }
        return s.pop();
    }
}
