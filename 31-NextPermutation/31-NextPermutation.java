// Last updated: 8/23/2025, 10:30:38 PM
class Solution {
    public void nextPermutation(int[] nums) {
        nextperm(nums);
    }
    public static void Reverse(int[] arr, int i, int j) {

		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;

		}
	}
    public static void nextperm(int []arr)
    {
        int p=-1;
        int n=arr.length;
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i+1]>arr[i])
            {
                p=i;
                break;
            }
        }
        if(p==-1)
        {
            Reverse(arr,0,n-1);
            return ;
        }
        int q=-1;
        for(int i=n-1;i>p;i--)
        {
            if(arr[p] < arr[i])
            {
                q=i;
                break;
            }
        }
        int temp=arr[p];
        arr[p]=arr[q];
        arr[q]=temp;
        // arr[p]=arr[p]^arr[q];
        // arr[q]=arr[p]^arr[q];
        // arr[p]=arr[p]^arr[q];
        Reverse(arr,p+1,n-1);
    }
}