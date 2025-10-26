// Last updated: 10/26/2025, 8:12:10 AM
class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->(int)Math.pow(a,2)-(int)Math.pow(b,2));
        for(int i=0;i<n;i++)
            {
                pq.add(nums[i]);
            }
        long ans=0;
        // Arrays.sort(nums);
        for(int i=0;i<n/2;i++)
            {
                ans-=(long)Math.pow(pq.poll(),2);
            }
        for(int i=n/2;i<n;i++)
            {
                ans+=(long)Math.pow(pq.poll(),2);
            }
        // for(int i=(n+1))
        return ans;
    }
}