// Last updated: 11/22/2025, 8:29:42 PM
class Solution {
    public int minimumFlips(int n) {
        String s=Integer.toBinaryString(n);
        int ans=0;
        String rev=new StringBuilder(s).reverse().toString();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=rev.charAt(i))
            {
                ans++;
            }
        }
        System.out.print(s+" "+rev);
        return ans;
    }
}