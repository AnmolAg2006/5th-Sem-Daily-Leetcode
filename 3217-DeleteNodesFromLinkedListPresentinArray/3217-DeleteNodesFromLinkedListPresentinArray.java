// Last updated: 11/1/2025, 9:13:43 AM
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
    public ListNode helper(HashSet<Integer>hs,ListNode head)
    {
        if(head==null) return null;
        if(hs.contains(head.val)) return head=helper(hs,head.next);
        else head.next=helper(hs,head.next);
        return head;
    }
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer>arr=new HashSet<>();
        for(int i:nums)
        {
            arr.add(i);
        }
        return helper(arr,head);
        // System.out.print(arr);
        // return head;

    }
}