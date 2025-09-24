// Last updated: 9/24/2025, 9:57:09 AM
class Solution {
    public int minimumPushes(String word) {
        int ans=0;
         Integer c[] = new Integer[26];   // Use Integer instead of int
        Arrays.fill(c, 0);

        for(char ch:word.toCharArray())
        {
            c[ch-'a']++;
        }
        Arrays.sort(c,Collections.reverseOrder());
        int i=0;
        while(i<26 && c[i]!=0)
        {
            ans+=c[i]*(i/8+1);
            i++;
        }
        return ans;
    }
}