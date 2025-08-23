// Last updated: 8/23/2025, 10:26:54 PM
class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder s1 = new StringBuilder(s);
        for(int i=0;i<indices.length;i++){
            s1.setCharAt(indices[i],s.charAt(i));
        }
        return s1.toString();
    }
}