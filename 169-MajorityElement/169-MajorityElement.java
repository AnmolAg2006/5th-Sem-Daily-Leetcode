// Last updated: 8/23/2025, 10:29:43 PM
class Solution {
    public static int Majority_Element(int arr[])
    {
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int arr[]=new int [n];
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i]=sc.nextInt();
        // }
        // [1,1,12,1,3,2]
        int v=1;
        int e=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(e!=arr[i])
            {
                v--;
                if(v==0)
                {
                    e=arr[i];
                    v=1;
                    continue;
                }
            }
            else{
                v++;
                // e=arr[i];
            }

        }
        return e;
    }
    public int majorityElement(int[] nums) {
        // int v=1;
        // int e=nums[0];
        // for(int i=1;i<nums.length;i++)
        // {
        //     if(e!=nums[i])
        //     {
        //         v--;
        //     }
        //     else{
        //         v++;
        //     }
        //     if(v==0)
        //     {
        //         e=nums[i];
        //         v=1;
        //     }
        // }
        //     return e;
        return Majority_Element(nums);
    }
}