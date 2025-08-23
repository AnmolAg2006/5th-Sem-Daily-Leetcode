// Last updated: 8/23/2025, 10:26:24 PM
class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");

        StringBuilder truncate = new StringBuilder();
        for(int i=0; i<k; i++) {
            truncate.append(arr[i]);

            if(i < k-1) {
                truncate.append(" ");
            }
        }
        return truncate.toString();
    }
}