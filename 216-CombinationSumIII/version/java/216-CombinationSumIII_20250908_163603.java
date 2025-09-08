// Last updated: 9/8/2025, 4:36:03 PM
class Solution {
    public static void combination(List<Integer>temp,List<List<Integer>>ans,int k,int n,int sum,int start)
    {
        if(sum==n && temp.size()==k)
        {
            ans.add(new ArrayList<Integer>(temp));
            return;
        }
        for(int i=start;i<=9;i++)
        {
            temp.add(i);
            combination(temp,ans,k,n,sum+i,i+1);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>ans=new ArrayList<>();
        combination(new ArrayList<Integer>(),ans,k,n,0,1);
        return ans;
    }
}