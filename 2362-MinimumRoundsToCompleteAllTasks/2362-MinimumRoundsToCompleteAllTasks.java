// Last updated: 8/23/2025, 10:25:41 PM
class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i:tasks)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int ans=0;
        for(int i:hm.values())
        {
            if(i==1) return -1;
            else ans+=Math.ceil((double)i/3);
        }
        return ans;
    }
}