// Last updated: 8/23/2025, 10:30:49 PM
class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int max_area=0;
        while(l<r)
        {
            max_area=Math.max(max_area,Math.min(height[r],height[l])*(r-l));
            if(height[r]<height[l])
            {
                r--;
            }
            else{
                l++;
            }
        }
        return max_area;
    }
}