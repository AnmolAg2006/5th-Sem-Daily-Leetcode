// Last updated: 8/23/2025, 10:23:53 PM
class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer>hm=new HashMap<>();
        for(char c:s.toCharArray())
        {
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        int omax=Integer.MIN_VALUE;
        int emin=Integer.MAX_VALUE;
        for(int i:hm.values())
        {
            if(i%2==0)
            {
                emin=Math.min(emin,i);
            }
            else{
                omax=Math.max(omax,i);
            }
        }
        // System.out.print(hm.values());
        return omax-emin;
    }
}