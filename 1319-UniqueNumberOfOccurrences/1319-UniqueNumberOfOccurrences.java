// Last updated: 8/23/2025, 10:27:28 PM
class Solution {
    public boolean uniqueOccurrences(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int c:nums)
        {
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        int ans=0;
        HashSet<Integer>hs=new HashSet<>();
        for(int i:hm.keySet())
        {
            if(hs.contains(hm.get(i)))
            {
                return false;
            }
            hs.add(hm.get(i));
        }
        return true;
        
    }
}