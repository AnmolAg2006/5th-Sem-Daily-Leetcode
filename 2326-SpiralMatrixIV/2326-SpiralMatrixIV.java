// Last updated: 10/22/2025, 12:56:29 AM
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
    public int[][] spiralMatrix(int n, int m, ListNode head) {
        int ans[][]=new int[n][m];
        int mini=0;
        int minj=0;
        int maxi=n-1;
        int maxj=m-1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                ans[i][j]=-1;
            }
        }
        while(head!=null && mini<=maxi && maxj>=minj)
        {
            for(int i=minj;i<=maxj && head!=null;i++)
            {
                ans[mini][i]=head.val;
                head=head.next;
            }
            mini++;
            for(int i=mini;i<=maxi && head!=null;i++)
            {
                ans[i][maxj]=head.val;
                head=head.next;
            }
            maxj--;
            for(int i=maxj;i>=minj && head!=null;i--)
            {
                ans[maxi][i]=head.val;
                head=head.next;
            }
            maxi--;
            for(int i=maxi;i>=mini && head!=null;i--)
            {
                ans[i][minj]=head.val;
                head=head.next;
            }
            minj++;
        }
        return ans;
    }
}