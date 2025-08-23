// Last updated: 8/23/2025, 10:24:30 PM
class Solution {
    public int numberOfSpecialChars(String word) {
        int c[]=new int[123];
        for(int i=0;i<word.length();i++)
        {
            c[word.charAt(i)]++;
        }
        int c1=0;
        for(int i=0;i<26;i++)
        {
            if(c[(i+65)]!=0 && c[(i+97)]!=0)
            {
                c1++;
            }
        }
        // for(int i=0;i<500;i++)
        // {
        //     System.out.print(c[i]+" ");
        // }
        return c1;
    }
}