// Last updated: 11/16/2025, 8:04:49 AM
class Solution {
    public int minLengthAfterRemovals(String s) {
        int a=0;
        for(char c:s.toCharArray())
            {
                if(c=='a') a++;
            }
        return Math.abs(s.length()-2*a);
    }
}