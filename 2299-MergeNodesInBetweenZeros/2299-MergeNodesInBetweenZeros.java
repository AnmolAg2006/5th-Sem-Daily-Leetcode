// Last updated: 8/23/2025, 10:25:45 PM
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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=head.next;
        int sum=0;
        while(temp.val!=0)
        {
            sum+=temp.val;
            temp=temp.next;
        }
        ListNode head1=new ListNode(sum);
        sum=0;
        
        ListNode temp1=head1;
        while(temp!=null)
        {
            if(temp.val==0)
            {
                if(sum!=0)
                {
                    temp1.next=new ListNode(sum);
                    sum=0;
                    temp1=temp1.next;
                }
            }
            else{
                sum+=temp.val;
            }
            temp=temp.next;
        }
        return head1;
    }
}