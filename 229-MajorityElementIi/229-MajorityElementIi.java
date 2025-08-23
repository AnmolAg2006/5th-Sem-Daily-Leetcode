// Last updated: 8/23/2025, 10:29:30 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int e:nums)
        {
            if(map.containsKey(e))
            {
                map.put(e, map.get(e)+1);
            }
            else{
                map.put(e, 1);
            }

        }
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i:map.keySet())
        {
            if(map.get(i)>n/3)
            {
                ans.add(i);
            }
        }
        return ans;
    }
}