// Last updated: 11/19/2025, 10:38:17 AM
class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer>hs=new HashSet<>();
        for(int i:nums)
        {
            hs.add(i);
        }
        while(hs.contains(original))
        {
            hs.remove(original);
            original*=2;
            // hs.add(original*2);
        }
        return original;
    }
}