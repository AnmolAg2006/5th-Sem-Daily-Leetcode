// Last updated: 11/5/2025, 2:44:22 PM
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        HashSet<Integer>hs=new HashSet<>();
        for(int i:nums)
            {
                hs.add(i);
                max=Math.max(i,max);
                min=Math.min(i,min);
            }
        List<Integer>ans=new ArrayList<>();
        for(int i=min;i<=max;i++)
            {
                if(!hs.contains(i))
                {
                    ans.add(i);
                }
            }
        return ans;
    }
}