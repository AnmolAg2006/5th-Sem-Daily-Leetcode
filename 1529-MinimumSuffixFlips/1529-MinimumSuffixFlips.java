// Last updated: 9/14/2025, 9:30:56 PM
class Solution {
    public int minFlips(String target) {
        int ans=0;
        // int j=target.indexOf("1");
        boolean one=false;
        for(int i=0;i<target.length();i++)
        {
            if(one && target.charAt(i)=='0')
            {
                ans++;
                one=false;
            }else if(!one && target.charAt(i)=='1') {
                ans++;
                one =true;
            }
        }
        return ans;
    }
}