// Last updated: 10/12/2025, 8:24:25 PM
class Solution {
    public int[] findErrorNums(int[] nums) {
        int ans[]=new int[2];
        int n=nums.length;
        HashSet<Integer>hs=new HashSet<>();
        int sum=0;
        for(int i:nums)
        {
            if(hs.contains(i))
            {
                ans[0]=i;
                continue;
            }
            sum+=i;
            hs.add(i);
        }
        ans[1]=n*(n+1)/2-sum;
        return new int[]{ans[0],n*(n+1)/2-sum};
    }
}