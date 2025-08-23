// Last updated: 8/23/2025, 10:30:34 PM
class Solution {
    public static void rec( List<List<Integer>>ans,List<Integer> temp,int t,int c[],int sum,int i)
    {
        // Base Case
        if(t==sum)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        if( i==c.length||t<sum)
        {
            return;
        }
        // Recursion
        temp.add(c[i]);
        rec(ans,temp,t,c,sum+c[i],i);
        temp.remove(temp.size()-1);
        rec(ans,temp,t,c,sum,i+1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        rec(ans,new ArrayList<>(),target,candidates,0,0);
        return ans;
    }
}