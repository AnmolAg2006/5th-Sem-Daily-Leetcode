// Last updated: 8/23/2025, 10:24:28 PM
class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int ans=0;
        HashSet<Integer>h=new HashSet<>();
        for(int i:nums)
        {
            if(h.contains(i))
            {
                ans^=i;
            }
            else{
                h.add(i);
            }
        }
        return ans;
    }
}