// Last updated: 11/27/2025, 11:16:29 PM
1class Solution {
2    public String arrangeWords(String text) {
3        String w[]=text.split(" ");
4        Arrays.sort(w,(a,b)->a.length()-b.length());
5        StringBuilder ans=new StringBuilder();
6        for(int i=0;i<w.length;i++)
7        {
8            ans.append(w[i].toLowerCase()+" ");
9        }
10        text=ans.toString();
11        text=(char)(text.charAt(0)-32)+text.substring(1,text.length()-1);
12        return text;
13    }
14}