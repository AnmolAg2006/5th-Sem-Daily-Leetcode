// Last updated: 8/23/2025, 10:30:33 PM
class Solution {
    public int trap(int[] height) {
        int l[]=new int[height.length];
        int r[]=new int[height.length];
        l[0]=height[0];
        int len=l.length;
        int max=height[0];
        for(int i=1;i<len;i++)
        {
            if(max<height[i])
            {
                max=height[i];
            }
            l[i]=max;
        }
        max=height[len-1];
        r[len-1]=height[len-1];
        for(int i=len-2;i>=0;i--)
        {
            if(max<height[i])
            {
                max=height[i];
            }
            r[i]=max;
        }
        int sum=0;
        for (int i = 0; i < r.length; i++) {
            sum+=Math.min(l[i],r[i])-height[i];
        }
        return sum;
    }
}