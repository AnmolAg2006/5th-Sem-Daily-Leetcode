// Last updated: 10/8/2025, 11:12:11 AM
class Solution {
    public String countAndSay(int n) {
        if(n==1)
        {
            return "1";
        }
        String s=countAndSay(n-1);
        StringBuilder ans=new StringBuilder();
        int c=1;
        char curr=s.charAt(0);
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=curr)
            {
                ans.append(c+""+curr);
                c=1;
                curr=ch;
            } else{
                c++;
            }
        }
        ans.append(c+""+curr);
        return ans.toString();
    }
}