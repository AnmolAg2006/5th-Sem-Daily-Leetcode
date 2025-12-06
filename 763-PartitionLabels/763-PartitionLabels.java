// Last updated: 12/6/2025, 11:32:41 AM
1class Solution {
2    public List<Integer> partitionLabels(String s) {
3        HashMap<Character,Integer>hm=new HashMap<>();
4        for(int i=0;i<s.length();i++)
5        {
6            char c=s.charAt(i);
7            // hm.put(c,hm.getOrDefault(c,0)+1);
8            hm.put(c,i);
9        }
10        List<Integer> ans=new ArrayList<>();
11        int co=0;
12        int last=0;
13        int temp=0;
14        for(int i=0;i<s.length();i++)
15        {
16            char c=s.charAt(i);
17            last=Math.max(hm.get(c),last);
18            temp++;
19            if(i==last){
20                ans.add(temp);
21                temp=0;
22            } 
23        }
24        return ans;
25    }
26}