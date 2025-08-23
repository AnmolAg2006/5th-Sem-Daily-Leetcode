// Last updated: 8/23/2025, 10:24:05 PM
class Solution {
    public int possibleStringCount(String word) {
    // String unique_str="";
    int c[]=new int [26];
    int c1=0;
    int c2=word.charAt(0);
        for(int i=1;i<word.length();i++)
        {
            if(word.charAt(i)-word.charAt(i-1)==0){
                c1++;
            }
        }
        return c1+1;
    }
}