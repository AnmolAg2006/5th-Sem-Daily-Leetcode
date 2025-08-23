// Last updated: 8/23/2025, 10:27:57 PM
class Solution {
    public String maskPII(String s) {
        StringBuilder ans=new StringBuilder();
        if(Character.isLetter(s.charAt(0)))
        {
            s=s.toLowerCase();
            int rate=s.indexOf('@');
            ans.append(s.charAt(0)+"*****"+s.charAt(rate-1)+"@"+s.substring(rate+1));
            return ans.toString();
        }
        else{
            StringBuilder s2=new StringBuilder();
            for(char c:s.toCharArray())
            {
                if(c>='0' && c<='9')
                {
                    s2.append(c);
                }
            }
            int size=s2.length();
            if(size==10)
            {
                return "***-***-"+s2.toString().substring(size-4);
            }
            ans.append("+");
            for(int i=0;i<size-10;i++)
            {
                ans.append("*");
            }
            ans.append("-***-***-"+s2.toString().substring(size-4));
            return ans.toString();
        }
        // return "";
    }
}