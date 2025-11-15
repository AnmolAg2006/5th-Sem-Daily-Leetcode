// Last updated: 11/15/2025, 8:59:08 PM
class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->b[1]-a[1]);
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i:barcodes) {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int i:hm.keySet())
        {
            pq.add(new int[]{i,hm.get(i)});
        }
        int j=0;
        int prev[]=null;
        while(!pq.isEmpty())
        {
            int []arr=pq.poll();
            
            barcodes[j++]=arr[0];
            arr[1]--;

            if(prev!=null && prev[1]>0)
            {
                pq.add(prev);
            }
            prev=arr;
        }
        return barcodes;
    }
}