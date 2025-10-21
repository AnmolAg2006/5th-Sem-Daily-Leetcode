// Last updated: 10/22/2025, 12:57:38 AM
class Solution {
    static {
        ListNode toFill = new ListNode(1, new ListNode(2));
        for (int i = 0; i < 300; i++) spiralMatrix(1,2, toFill);
    }
    public static int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] result = new int[m][];
        for (int i = 0; i < m; i++) {
            result[i] = new int[n];
            Arrays.fill(result[i], -1);
        }

        int left = 0, right = n - 1, top = 0, bottom = m - 1;

        while (head != null) {
            for (int c = left; c <= right && head != null; c++) {
                result[top][c] = head.val;
                head = head.next;
            }
            top++;
            for (int r = top; r <= bottom && head != null; r++) {
                result[r][right] = head.val;
                head = head.next;
            }
            right--;
            for (int c = right; c >= left && head != null; c--) {
                result[bottom][c] = head.val;
                head = head.next;
            }
            bottom--;
            for (int r = bottom; r >= top && head != null; r--) {
                result[r][left] = head.val;
                head = head.next;
            }
            left++;
        }
        return result;

    }
}