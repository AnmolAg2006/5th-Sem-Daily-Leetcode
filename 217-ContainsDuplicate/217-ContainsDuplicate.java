// Last updated: 8/23/2025, 10:29:35 PM
import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hm = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(hm.contains(nums[i])){
                return true;
            }else{
                hm.add(nums[i]);
            }
        }
        return false;
    }
}