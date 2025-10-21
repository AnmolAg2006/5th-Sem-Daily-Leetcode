// Last updated: 10/22/2025, 12:42:49 AM
class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int ans=0;
        HashMap<Character,Integer>hm=new HashMap<>();
        int pf[]=new int[travel.length];
        pf[0]=travel[0];
        for(int i=1;i<travel.length;i++)
        {
            pf[i]=travel[i]+pf[i-1];
            
        }
        for(int i=0;i<garbage.length;i++)
        {
            String s=garbage[i];
            for(char c:s.toCharArray())
            {
                hm.put(c,i);
                ans++;
            }
        }
        for(char c:hm.keySet())
        {
            if(hm.get(c)!=0) ans+=pf[hm.get(c)-1];
        }
        return ans;
    }
}