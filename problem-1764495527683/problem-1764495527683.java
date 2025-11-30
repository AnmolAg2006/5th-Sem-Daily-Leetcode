// Last updated: 11/30/2025, 3:08:47 PM
1class Solution {
2    public int numSplits(String s) {
3        HashSet<Character>left=new HashSet<>();
4        HashSet<Character>right=new HashSet<>();
5        int n=s.length();
6        int l[]=new int[n];
7        int r[]=new int[n];
8        for(int i=0;i<n;i++)
9        {
10            left.add(s.charAt(i));
11            l[i]=left.size();
12        }
13        
14        for(int i=0;i<n;i++)
15        {
16            right.add(s.charAt(n-i-1));
17            r[n-i-1]=right.size();
18        }
19        int ans=0;
20        for(int i=0;i<n-1;i++)
21        {
22            if(l[i]==r[i+1]) ans++;
23        }
24        return ans;
25    }
26}