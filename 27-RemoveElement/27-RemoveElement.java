// Last updated: 8/23/2025, 10:30:39 PM
import java.util.*;
class Solution {
    public int removeElement(int[] nums, int val) {
        int c=0;
        int c1=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==val)
            {
                c1++;
            }
        }
        for (int i = 0; i < nums.length-1-c; i++) {
            if(nums[i]==val)
            {   
                c++;
                int temp=nums[i];
                nums[i]=nums[nums.length-c];
                nums[nums.length-c]=temp;
                i--;
            }
        }
        return nums.length-c1;

    }
}