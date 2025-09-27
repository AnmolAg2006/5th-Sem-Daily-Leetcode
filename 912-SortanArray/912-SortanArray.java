// Last updated: 9/27/2025, 12:55:07 PM
class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i:nums)
        {
            pq.add(i);
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=pq.poll();
        }
        return nums;
    }
}