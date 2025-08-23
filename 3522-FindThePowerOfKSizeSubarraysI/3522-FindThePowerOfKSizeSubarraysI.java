// Last updated: 8/23/2025, 10:24:16 PM
class Solution {
    public static int isTrue(int arr[],int k)
    {
        for(int i=0;i<k-1;i++)
        {
            if(arr[i+1]-arr[i]!=1)
            {
                return -1;
            }

        }
        return arr[k-1];
    }
    public int[] resultsArray(int[] nums, int k) {
        int l=nums.length;
        int result[]=new int[l-k+1];
        for(int i=0;i<l-k+1;i++)
        {
            
                result[i]=isTrue(Arrays.copyOfRange(nums, i, i+k),k);
            
        }
        return result;
    }
}