// Last updated: 8/23/2025, 10:27:13 PM
class Solution {
    public int minSteps(String s, String t) {
        int[] maps=new int[26];
        int[] mapt=new int[26];

        for(char ch:s.toCharArray()) {
            maps[ch-'a']++;
        }
        for(char ch:t.toCharArray()) {
            mapt[ch-'a']++;
        }
        int x=0;
        for(int i=0;i<26;i++) {
            if(mapt[i]>maps[i]) {
                x+=(mapt[i]-maps[i]);
            }
        }
        return x;
    }
}