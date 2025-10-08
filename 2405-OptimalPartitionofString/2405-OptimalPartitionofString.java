// Last updated: 10/8/2025, 11:43:48 AM
class Solution {
    public int partitionString(String s) {
        int c=1;
        boolean seen[]=new boolean [26];
        for(char ch:s.toCharArray())
        {
            if(seen[ch-'a'])
            {
                c++;
                seen=new boolean[26];
            }
            seen[ch-'a']=true;
        }
        return c;
    }
}