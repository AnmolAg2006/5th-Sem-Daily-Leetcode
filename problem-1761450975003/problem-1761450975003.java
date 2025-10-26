// Last updated: 10/26/2025, 9:26:15 AM
class Solution {
    public long countStableSubarrays(int[] capacity) {
        int n = capacity.length;
        long ps[] = new long[n+1];
        for (int i = 0; i < n; i++) {
            ps[i+1]=ps[i]+capacity[i];
        }
        
        long ans=0;
        Map<Long,Map<Long,Long>>hm=new HashMap<>();
        hm.computeIfAbsent((long)capacity[0],x->new HashMap<>()).put(ps[1],1L);
        for(int r=2;r<n;r++)
            {
               long v=capacity[r];
                long nd=ps[r]-v;
                Map<Long,Long>in=hm.get(v);
                if(in!=null)
                {
                    ans+=in.getOrDefault(nd,0L);
                }
                long key=capacity[r-1];
                hm.putIfAbsent(key,new HashMap<>());
                Map<Long,Long>in2=hm.get(key);
                in2.put(ps[r],in2.getOrDefault(ps[r],0L)+1);
            }
        return ans;
    }
}