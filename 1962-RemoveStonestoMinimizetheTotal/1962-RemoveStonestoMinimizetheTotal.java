// Last updated: 9/27/2025, 10:23:12 AM
class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:piles)
        {
            pq.add(i);
        }
        while(k-->0)
        {
            pq.add(pq.peek()-pq.poll()/2);
        }
        int ans=0;
        while(!pq.isEmpty())
        {
            ans+=pq.poll();
        }
        return ans;
    }
}