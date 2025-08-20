// Last updated: 8/20/2025, 12:37:24 PM
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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode temp=new ListNode();
        ListNode dummy=temp;
        PriorityQueue<ListNode>pq=new PriorityQueue<>((a, b) -> a.val - b.val);
        for(int i=0;i<lists.length;i++)
        {
            if(lists[i]!=null)
            {
                pq.add(lists[i]);
            }
        }
        while(!pq.isEmpty())
        {
            ListNode curr=pq.poll();
            dummy.next=curr;
            dummy=dummy.next;
            if(curr.next!=null)
            {
                pq.add(curr.next);
            }
        }
        return temp.next;
    }
}