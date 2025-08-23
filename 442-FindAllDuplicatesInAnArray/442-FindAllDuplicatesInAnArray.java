// Last updated: 8/23/2025, 10:28:48 PM
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        int c[]=new int [n];
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            c[nums[i]-1]++;
        }
        for(int i=0;i<n;i++)
        {
            if(c[i]==2)
            {
                arr.add(i+1);
            }
        }
        return arr;
    }
}