// Last updated: 12/15/2025, 10:52:12 AM
1class Solution {
2    public static boolean check(String a,String b)
3    {
4        int f[]=new int[26];
5        for(int i=0;i<a.length();i++)
6        {
7            f[a.charAt(i)-'a']=1;
8        }
9        for(int i=0;i<b.length();i++)
10        {
11            if(f[b.charAt(i)-'a']==1){
12                return false;
13            }
14        }
15        return true;
16    }
17    public int maxProduct(String[] words) {
18        int ans=0;
19        int n=words.length;
20        for(int i=0;i<n;i++)
21        {
22            for(int j=i+1;j<n;j++)
23            {
24                if(check(words[i],words[j]))
25                {
26                    ans=Math.max(ans,words[i].length()*words[j].length());
27                }
28            }
29        }
30        return ans;
31    }
32}