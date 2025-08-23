// Last updated: 8/23/2025, 10:24:44 PM
class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i:nums)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int ans=0;
        for(int i:hm.values())
        {
            if(i==1)
            {
                return -1;
            }
            ans+=((i+2)/3);
        }
        return ans;
    }
}