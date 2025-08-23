// Last updated: 8/23/2025, 10:26:01 PM
class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxLen = 0;
		
        for (String currSent : sentences) {
            int currLen = currSent.split(" ").length;
            if (maxLen < currLen)
                maxLen = currLen;
        }
        return maxLen;
    }
}