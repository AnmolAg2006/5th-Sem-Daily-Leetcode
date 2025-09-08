// Last updated: 9/8/2025, 12:46:33 PM
class Solution {
    public boolean check(int[] nums) {
        // boolean isUsed = false;
        // int min = nums[0];
        // for (int i = 0; i < nums.length-1; i++) {
        //     if (nums[i + 1] < nums[i] && !isUsed) {
        //         if (min > nums[i + 1]) {
        //             isUsed = true;
        //         } else {
        //             return false;
        //         }
        //     } else if (nums[i + 1] < nums[i] && isUsed) {
        //         return false;
        //     }
        // }
        // return true;
        int idx=-1;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i+1]<nums[i]) {
                idx=i+1;
                break;
            }
        }
        if(idx==-1)
        {
            return true;
        }
        for(int i=idx;i<nums.length+idx-1;i++)
        {
            if(nums[(i+1)%nums.length]<nums[i%nums.length])
            {
                return false;
            }
        }
        return true;
    }
}