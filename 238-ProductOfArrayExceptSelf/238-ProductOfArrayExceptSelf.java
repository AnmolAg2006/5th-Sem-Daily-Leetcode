// Last updated: 8/23/2025, 10:29:26 PM
class Solution {
    public static void rain(int height[])
    {
        int l[]=new int[height.length];
        int r[]=new int[height.length];
        l[0]=height[0];
        int len=l.length;
        int max=1;
        for(int i=0;i<len;i++)
        {
            l[i]=max;
            max*=height[i];
        }
        max=height[len-1];
        r[len-1]=1;
        for(int i=len-2;i>=0;i--)
        {
            r[i]=max;
            max*=height[i];
        }
        for (int i = 0; i < r.length; i++) {
            height[i]=l[i]*r[i];
        }
        
    }
    public int[] productExceptSelf(int[] nums) {
        rain(nums);
        return nums;
    }
}