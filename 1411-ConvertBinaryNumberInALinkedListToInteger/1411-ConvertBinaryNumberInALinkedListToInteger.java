// Last updated: 8/23/2025, 10:27:19 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        StringBuilder n=new StringBuilder();
        while(head!=null)
        {
            n.append(head.val);
            head=head.next;
        }
        return Integer.parseInt(n.toString(),2);
    }
}