// Last updated: 10/19/2025, 11:55:10 PM
class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans=0;
        Map<Integer, Integer> hm = new HashMap<>();
        hm.put(0,1);
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(hm.containsKey(sum-k)) ans+=hm.get(sum-k);
            hm.put(sum,hm.getOrDefault(sum,0)+1);

        }
        System.out.println(hm);
        return ans;
    }
}