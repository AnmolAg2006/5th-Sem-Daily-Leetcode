// Last updated: 11/8/2025, 11:17:51 PM
class Solution {
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        List<List<Integer>> ans=new ArrayList();
        int n=colsum.length;
        Integer u[]=new Integer[n];
        Integer l[]=new Integer[n];
        Arrays.fill(u,0);
        Arrays.fill(l,0);
        int sum=0;
        for(int i:colsum)
        {
            sum+=i;
            if(i>2) return ans;
        }
        if(sum!=lower+upper) return ans;
        for(int i=0;i<n;i++)
        {
            if(colsum[i]==2)
            {
                l[i]=1;
                u[i]=1;
                upper--;
                lower--;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(colsum[i]==1)
            {
                if(upper>0)
                {
                    u[i]=1;
                    upper--;
                }
                else{
                    l[i]=1;
                    lower--;
                }
            }
        }
        if(upper !=0 || lower !=0) return ans;
        ans.add(Arrays.asList(u));
        ans.add(Arrays.asList(l));
        return ans;
    }

}