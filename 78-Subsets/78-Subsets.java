// Last updated: 8/23/2025, 10:30:14 PM
class Solution {
    public static void perm(int arr[],List<Integer>temp,int i,List<List<Integer>> ans)
    {
        ans.add(new ArrayList<>(temp));
        for(int j=i;j<arr.length;j++)
        {
            if(j>i && arr[j]==arr[j-1])
            {
                continue;
            }
            temp.add(arr[j]);
            perm(arr,temp,j+1,ans);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer>temp=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        perm(nums,temp,0,ans);
        return ans;   
    }
}