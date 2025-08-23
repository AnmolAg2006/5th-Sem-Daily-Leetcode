// Last updated: 8/23/2025, 10:26:33 PM
class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int c:nums)
        {
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        int ans=0;
        for(int i:nums)
        {
            if(hm.get(i)==1)
            {
                ans+=i;
            }
        }
        return ans;
        
    }
}