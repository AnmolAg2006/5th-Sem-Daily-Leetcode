// Last updated: 8/23/2025, 10:24:51 PM
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
    private int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp=head;
        while(temp.next!=null)
        {
            int gcd1=gcd(temp.val,temp.next.val);
            ListNode temp1=temp.next;
            temp.next=new ListNode(gcd1);
            temp.next.next=temp1;
            temp=temp1;
        }
        return head;
    }
}