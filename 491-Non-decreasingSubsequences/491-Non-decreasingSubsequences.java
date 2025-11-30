// Last updated: 11/30/2025, 4:37:59 PM
1class Solution {
2    
3    public static void fun(int[] nums,Set<List<Integer>> ans,List<Integer>temp,int i) {
4        if(i==nums.length)
5        {
6            if(temp.size()>=2)
7            {
8                ans.add(new ArrayList<>(temp));
9            }
10                return ;
11        }
12        if(temp.size()==0 || temp.get(temp.size()-1)<=nums[i]) {
13            temp.add(nums[i]);
14            fun(nums,ans,temp,i+1);
15            temp.remove(temp.size()-1);
16        }
17        fun(nums,ans,temp,i+1);
18
19    }
20    public List<List<Integer>> findSubsequences(int[] nums) {
21        Set<List<Integer>> ans=new HashSet<>();
22        fun(nums,ans,new ArrayList<>(),0);
23        return new ArrayList(ans);
24    }
25}