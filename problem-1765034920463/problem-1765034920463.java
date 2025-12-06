// Last updated: 12/6/2025, 8:58:40 PM
1class Solution {
2    public static boolean isPalin(int n)
3    {
4        String s=Integer.toBinaryString(n);
5        for(int i=0;i<s.length()/2;i++)
6            {
7                if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
8            }
9        return true;
10    }
11    public int[] minOperations(int[] nums) {
12        int ans[]=new int[nums.length];
13        int opi=0;
14        int n=nums.length;
15        for(int i=0;i<n;i++)
16            {
17                int n1=nums[i];
18                while(true)
19                    {
20                        if(isPalin(n1))
21                        {
22                            opi=-nums[i]+n1;
23                            break;
24                        }
25                        n1++;
26                    }
27                n1=nums[i];
28                while(true)
29                    {
30                        if(isPalin(n1))
31                        {
32                            opi=Math.min(opi,nums[i]-n1);
33                            break;
34                        }
35                        n1--;
36                    }
37                ans[i]=opi;
38            }
39        return ans;
40    }
41}