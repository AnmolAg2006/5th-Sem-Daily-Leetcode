// Last updated: 8/23/2025, 10:27:06 PM
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        int n=target.length;
        if(n!=arr.length)
        {
            return false;
        }
        for(int i=0;i<n;i++)
        {
            if(target[i]!=arr[i])
            {
                return false;
            }

        }
        return true;
    }
}