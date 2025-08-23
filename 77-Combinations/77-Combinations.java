// Last updated: 8/23/2025, 10:30:15 PM
class Solution {
    public static void perm(int n,int k,int i,List<Integer>arr,List<List<Integer>> ans)
    {
        if(arr.size()==k)
        {
            ans.add(new ArrayList<>(arr));
            return ;
        }
        for (int j = i; j <= n-k+arr.size()+1; j++) {
            arr.add(j);
            perm(n, k, j+1, arr,ans);
            arr.remove(arr.size()-1);
        }

    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();   
        List<Integer>arr=new ArrayList<>();
        perm(n, k, 1,arr,ans );
        return ans;
    }
}