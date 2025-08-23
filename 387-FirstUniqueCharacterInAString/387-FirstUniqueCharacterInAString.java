// Last updated: 8/23/2025, 10:29:00 PM
class Solution {
    public int firstUniqChar(String s) {
        int l = s.length();
        int c[] = new int[26];
        for (int i = 0; i < l; i++) {
            c[s.charAt(i)-97]++;
        }
        for(int i=0;i<l;i++)
        {
            if(c[s.charAt(i)-97]==1)
            {
                return i;
            }
        }
        return -1;
    }
}