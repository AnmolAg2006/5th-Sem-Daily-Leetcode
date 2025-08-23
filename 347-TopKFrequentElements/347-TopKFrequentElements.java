// Last updated: 8/23/2025, 10:29:08 PM
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i:nums)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int ans[]=new int[k];
        int j=0;
        while(k-->0)
        {
            int max=-1;
            int mi=-1;
            for(int i:hm.keySet())
            {
                if(hm.get(i)>max)
                {
                    max=hm.get(i);
                    mi=i;
                }
            }
            ans[j++]=mi;
            hm.remove(mi);
        }
        return ans;
    }
}