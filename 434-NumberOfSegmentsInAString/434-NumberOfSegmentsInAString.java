// Last updated: 8/23/2025, 10:28:50 PM
class Solution {
    public int countSegments(String s) {
        if(s.trim().length()==0 || s==null){
            return 0;
        }
        String arr[]=s.trim().split("\\s+");
        return arr.length;
    }
}