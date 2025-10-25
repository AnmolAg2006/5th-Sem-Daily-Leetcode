// Last updated: 10/25/2025, 8:49:01 PM
class Solution {
    public String lexSmallest(String s) {
        int l = s.length();
       String ans=s;
        for(int k=1;k<=l;k++)
            {
                String a=new StringBuilder(s.substring(0,k)).reverse().toString()+s.substring(k);
                if(a.compareTo(ans)<0) ans=a;
                String b=s.substring(0,l-k)+new StringBuilder(s.substring(l-k)).reverse().toString();
                if(b.compareTo(ans)<0) ans=b;
            }
        return ans;
    }
}