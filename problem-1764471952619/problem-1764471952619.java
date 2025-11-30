// Last updated: 11/30/2025, 8:35:52 AM
1class Solution {
2    public static int reverse(int n) {
3        int ans = 0;
4        while (n != 0) {
5            int temp = n % 10;
6            ans = ans * 10 + temp;
7            n /= 10;
8        }
9        return ans;
10    }
11
12    public int minMirrorPairDistance(int[] nums) {
13        int ans=Integer.MAX_VALUE;
14        HashMap<Integer,Integer>hm=new HashMap<>();
15        for(int i=0;i<nums.length;i++)
16            {
17                int rev=reverse(nums[i]);
18                // hm.put(reverse(nums[i]),i);
19                if(hm.containsKey(nums[i]))
20                {
21                    ans=Math.min(ans,i-hm.get(nums[i]));
22                }
23                hm.put(rev,i);
24            }
25        // for(int i=0;i<nums.length;i++)
26        //     {
27        //         if(hm.get(nums[i]!=hm.get(reverse(nums[i])))) 
28        //            {
29        //             ans=math.min(hm.get(nums[i]!=hm.get(reverse(nums[i]))));
30        //            }
31        //     }
32        return (ans==Integer.MAX_VALUE)?-1:ans;
33        // return reverse(120);
34    }
35}