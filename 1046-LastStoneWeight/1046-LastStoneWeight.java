// Last updated: 9/27/2025, 8:13:19 AM
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->(b-a));
        for(int i:stones)
        {
            pq.add(i);
        }
        while(pq.size()>1)
        {
            int curr=pq.poll();
            // if(pq.size()==1)
            // {
            //     return pq.peek();
            // }
            if(pq.peek()==curr)
            {
                pq.poll();
            }
            else if(pq.peek()<curr)
            {
                pq.add(curr-pq.poll());
                // pq.poll();
            }
        }
        return (pq.isEmpty())?0: pq.poll();
    }
}