// Last updated: 8/23/2025, 10:27:53 PM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s=0;
        int e=arr.length-1;
        while(s<e)
        {
            int mid=(s+e)/2;
            if(arr[mid+1]<arr[mid])
            {
                e=mid;
            }
            else{
                s=mid+1;
            }

        }
        return s;
    }
}