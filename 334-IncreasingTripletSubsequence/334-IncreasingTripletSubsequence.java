// Last updated: 8/23/2025, 10:29:14 PM
class Solution {
    public boolean increasingTriplet(int[] nums) {
        // int arr[][]=new int [nums.length][2];
        // for(int i=0;i<nums.length;i++)
        // {
        //     arr[i][0]=i;
        //     arr[i][1]=nums[i];
        // }
        // Arrays.sort(arr,Comparator.comparingDouble(o -> o[1]));
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i:nums)
        {
            if(min1>=i)
            {
                min1=i;
            }
            else if(min2>=i){
                min2=i;

            }
            else{
                return true;
            }
        }
        return false;
    }
}