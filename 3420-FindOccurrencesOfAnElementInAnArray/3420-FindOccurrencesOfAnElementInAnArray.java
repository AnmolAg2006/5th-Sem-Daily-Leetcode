// Last updated: 8/23/2025, 10:24:29 PM
class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        ArrayList<Integer>map=new ArrayList<>();
        // int map[]=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==x)
            {
                map.add(i);
                // j++;
            }
        }
        int res[]=new int[queries.length];

        for (int i = 0; i < res.length; i++) {
            if (queries[i]>map.size()) {
                res[i]=-1;
            }
            else{
                res[i]=map.get(queries[i]-1);
            }
        }
        return res;
    }
}