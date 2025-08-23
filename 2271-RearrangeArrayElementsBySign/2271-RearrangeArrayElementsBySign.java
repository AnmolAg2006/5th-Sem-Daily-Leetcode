// Last updated: 8/23/2025, 10:25:49 PM
class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        int n=nums.length;
        int ans[]=new int [n];
        for(int i=0;i<n;i++)
        {
            if(nums[i]<0)
            {
                neg.add(nums[i]);

            }
            else{
                pos.add(nums[i]);
            }
        }
        for(int i=0;i<n;i+=2)
        {
            ans[i]=pos.get(i/2);
            ans[i+1]=neg.get(i/2);
        }
        return ans;
    }
}