// Last updated: 8/23/2025, 10:25:51 PM
class Solution {
    public String[] divideString(String s, int k, char fill) {
        StringBuilder str=new StringBuilder(s);

        while(str.length()%k!=0){
            str.append(fill);
        }
        s=str.toString();
        String ans[]=new String[s.length()/k];
        int i=0;
        while(i<ans.length)
        {
            ans[i]=s.substring(i*k,i*k+k);
            i++;
        }
        return ans;
    }
}